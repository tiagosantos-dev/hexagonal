package com.ts.hexagonal.adapters.outbound.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name= "tb_car")
public class CarEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String model;
    private String brand;
    private LocalDate producingDate;
    private String chassi;

    public CarEntity(){}

    public CarEntity(UUID id, String model, String brand, LocalDate producingDate, String chassi) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.producingDate = producingDate;
        this.chassi = chassi;
    }

    public UUID getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getProducingDate() {
        return producingDate;
    }

    public String getChassi() {
        return chassi;
    }
}
