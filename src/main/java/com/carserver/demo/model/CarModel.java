package com.carserver.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long year;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private String submodel;
    @Column
    private boolean removed;
}
