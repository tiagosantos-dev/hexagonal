package com.ts.hexagonal.domain.ports;

import com.ts.hexagonal.domain.entities.Car;

public interface CarService {

    Car register(Car car);
}
