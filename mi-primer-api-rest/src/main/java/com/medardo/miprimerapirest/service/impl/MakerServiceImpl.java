package com.medardo.miprimerapirest.service.impl;

import com.medardo.miprimerapirest.entity.Maker;
import com.medardo.miprimerapirest.persistence.IMakerDAO;
import com.medardo.miprimerapirest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerService iMakerService;


    @Override
    public List<Maker> findAll() {
        return iMakerService.findAll();
    }

    @Override
    public Optional<Maker> findByID(Long id) {
        return iMakerService.findByID(id);
    }

    @Override
    public void save(Maker maker) {
        iMakerService.save(maker);
    }

    @Override
    public void delete(Long id) {
        iMakerService.delete(id);
    }
}
