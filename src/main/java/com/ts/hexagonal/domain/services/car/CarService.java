package com.ts.hexagonal.domain.services.car;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.ports.CarRepository;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository  carRepository){
        this.carRepository = carRepository;
    }

    public Car register(Car car){
        return carRepository.persist(car);
    }


}
