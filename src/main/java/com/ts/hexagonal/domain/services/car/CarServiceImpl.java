package com.ts.hexagonal.domain.services.car;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.ports.CarRepository;
import com.ts.hexagonal.domain.ports.CarService;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository  carRepository){
        this.carRepository = carRepository;
    }

    public Car register(Car car){
        return carRepository.persist(car);
    }


}
