package com.medardo.miprimerapirest.service.impl;

import com.medardo.miprimerapirest.entity.Product;
import com.medardo.miprimerapirest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductService iProductService;

    @Override
    public List<Product> findAll(Long id) {
        return iProductService.findAll(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductService.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductService.save(product);
    }

    @Override
    public void delete(Product product) {
        iProductService.delete(product);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return iProductService.findByPriceInRange(minPrice,maxPrice);
    }
}
