package com.medardo.miprimerapirest.repository;
import com.medardo.miprimerapirest.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{

    // query usando queryMethods
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    // query usando JPA
    @Query("SELECT p FROM p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);


}
