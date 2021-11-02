package com.ts.hexagonal.adapters.configuration;

import com.ts.hexagonal.HexagonalApplication;
import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.ports.AllocationRepository;
import com.ts.hexagonal.domain.ports.CarRepository;
import com.ts.hexagonal.domain.ports.PersonRepository;
import com.ts.hexagonal.domain.services.allocation.AllocationService;
import com.ts.hexagonal.domain.services.car.CarService;
import com.ts.hexagonal.domain.services.person.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class BeanConfiguration {

    @Bean
    AllocationService allocationService(AllocationRepository allocationRepository) {
        return new AllocationService(allocationRepository);
    }

    @Bean
    PersonService personService(PersonRepository personRepository) {
        return new PersonService(personRepository);
    }
    @Bean
    CarService carService(CarRepository carRepository) {
        return new CarService(carRepository);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
