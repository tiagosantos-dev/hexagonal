package com.ts.hexagonal.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public class Car {
    private UUID id;
    private String model;
    private String brand;
    private LocalDate producingDate;
    private String chassi;

    public Car(UUID id, String model, String brand, LocalDate producingDate, String chassi){
      //  this(id, model, brand, producingDate, chassi);
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.producingDate = producingDate;
        this.chassi = chassi;
    }

    public Car() {
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", producingDate=" + producingDate +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
