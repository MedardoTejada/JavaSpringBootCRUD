package com.medardo.miprimerapirest.repository;
import com.medardo.miprimerapirest.entity.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository<Maker, Long>{

}
