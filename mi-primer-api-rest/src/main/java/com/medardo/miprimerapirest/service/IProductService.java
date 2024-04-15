package com.medardo.miprimerapirest.service;

import com.medardo.miprimerapirest.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll(Long id);

    Optional<Product> findById(Long id);

    void save(Product product);

    void delete(Product product);

    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

}
