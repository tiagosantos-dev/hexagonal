package com.ts.hexagonal.adapters.configuration;

import com.ts.hexagonal.HexagonalApplication;
import com.ts.hexagonal.domain.ports.AllocationRepository;
import com.ts.hexagonal.domain.ports.CarRepository;
import com.ts.hexagonal.domain.ports.PersonRepository;
import com.ts.hexagonal.domain.services.allocation.AllocationServiceImpl;
import com.ts.hexagonal.domain.services.car.CarServiceImpl;
import com.ts.hexagonal.domain.services.person.PersonServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class BeanConfiguration {

    @Bean
    AllocationServiceImpl allocationService(AllocationRepository allocationRepository) {
        return new AllocationServiceImpl(allocationRepository);
    }

    @Bean
    PersonServiceImpl personService(PersonRepository personRepository) {
        return new PersonServiceImpl(personRepository);
    }
    @Bean
    CarServiceImpl carService(CarRepository carRepository) {
        return new CarServiceImpl(carRepository);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
