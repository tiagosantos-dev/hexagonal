package com.ts.hexagonal.domain.services.car;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.ports.CarRepository;

public class RegisterNewCar {

    private final CarRepository carRepository;

    public RegisterNewCar(CarRepository  carRepository){
        this.carRepository = carRepository;
    }

    public Car register(Car car){
        return carRepository.persist(car);
    }


}
