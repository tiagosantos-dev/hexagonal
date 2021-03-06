package com.ts.hexagonal.adapters.outbound.persistence.implementations;

import com.ts.hexagonal.adapters.outbound.persistence.repositories.SpringDataH2CarRepository;
import com.ts.hexagonal.adapters.outbound.persistence.entities.CarEntity;
import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.ports.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Component
@Primary
public class CarRepositoryImp implements CarRepository {
    private final SpringDataH2CarRepository springDataH2CarRepository;

    public CarRepositoryImp(final SpringDataH2CarRepository springDataH2CarRepository){
        this.springDataH2CarRepository = springDataH2CarRepository;
    }

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Car findById(UUID id) {
        CarEntity car = springDataH2CarRepository.findById(id).get();
        return modelMapper.map(car, Car.class);
    }

    @Override
    public Car persist(Car car) {
        CarEntity carEntity = modelMapper.map(car, CarEntity.class);
        carEntity = springDataH2CarRepository.save(carEntity);
        return modelMapper.map(carEntity, Car.class);
    }

    @Override
    public List<Car> findByModel(String model) {
        return null;
    }

    @Override
    public List<Car> findByProducingDate(LocalDate producingDate) {
        return null;
    }
}
