package com.ts.hexagonal.domain.ports;

import antlr.collections.impl.LList;
import com.ts.hexagonal.domain.entities.Car;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface CarRepository {

    Car findById(UUID id);
    Car persist(Car car);
    List<Car> findByModel(String model);
    List<Car> findByProducingDate(LocalDate producingDate);

}
