package com.ts.hexagonal.adapters.inbound.controllers.car;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.ports.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody Car car){
        return ResponseEntity.ok(carService.register(car));
    }
}
