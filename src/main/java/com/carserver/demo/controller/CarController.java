package com.carserver.demo.controller;


import com.carserver.demo.model.CarModel;
import com.carserver.demo.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CarController {
    private CarRepository carRepo;

    public CarController(CarRepository carRepo){
        this.carRepo = carRepo;
    }

    @GetMapping("/cars")
    public List <CarModel> getAllStudents(){
        return (List<CarModel>)this.carRepo.findAll();
    }

    @PostMapping("/create")
    public CarModel saveCar(@RequestBody CarModel student){
        this.carRepo.save(student);
        return student; }

    @PutMapping("/cars/update")
    public List<CarModel> updateStudent(@RequestBody CarModel student){
        this.carRepo.save(student);
        return getAllStudents();}
}
