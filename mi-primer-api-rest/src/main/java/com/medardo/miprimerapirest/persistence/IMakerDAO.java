package com.medardo.miprimerapirest.persistence;

import com.medardo.miprimerapirest.entity.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> findAll();

    Optional<Maker> findByID(Long id);

    void save(Maker maker);

    void delete(Long id);
}
