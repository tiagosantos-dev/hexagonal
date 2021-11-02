package com.ts.hexagonal.adapters.outbound.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name= "tb_car")
public class CarEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String model;
    private String brand;
    private LocalDate producingDate;
    private String chassi;
}
