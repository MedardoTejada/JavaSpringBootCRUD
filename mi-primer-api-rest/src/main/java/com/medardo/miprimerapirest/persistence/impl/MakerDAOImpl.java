package com.medardo.miprimerapirest.persistence.impl;

import com.medardo.miprimerapirest.entity.Maker;
import com.medardo.miprimerapirest.persistence.IMakerDAO;
import com.medardo.miprimerapirest.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findByID(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);
    }

    @Override
    public void delete(Long id) {
        makerRepository.deleteById(id);
    }
}
