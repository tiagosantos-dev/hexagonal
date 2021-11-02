package com.ts.hexagonal.domain.ports;

import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.entities.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface AllocationRepository {

    Allocation findById(UUID id);
    Allocation persist(Allocation allocation);
    Allocation update(Allocation allocation);
    List<Allocation> findByPerson(Person person);
    List<Allocation> findByCar(Car car);


}
