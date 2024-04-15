package com.medardo.miprimerapirest.controllers;

import com.medardo.miprimerapirest.controllers.dto.MakerDTO;
import com.medardo.miprimerapirest.entity.Maker;
import com.medardo.miprimerapirest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/maker")
public class MakerController {

    @Autowired
    private IMakerService iMakerService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){

       Optional<Maker> makerOptional =  iMakerService.findByID(id);

       if (makerOptional.isPresent()){
           Maker maker = makerOptional.get();

           MakerDTO makerDTO = MakerDTO.builder()
                   .id(maker.getId())
                   .name(maker.getName())
                   .productList(maker.getProductList())
                   .build();

           return ResponseEntity.ok(makerDTO);
       }

       return ResponseEntity.notFound().build();

    }
}
