package com.carserver.demo.repository;


import com.carserver.demo.model.CarModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository <CarModel, Long> {
}
