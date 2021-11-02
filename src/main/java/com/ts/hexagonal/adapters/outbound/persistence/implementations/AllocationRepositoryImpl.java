package com.ts.hexagonal.adapters.outbound.persistence.implementations;

import com.ts.hexagonal.adapters.outbound.persistence.repositories.SpringDataH2AllocationRepository;
import com.ts.hexagonal.adapters.outbound.persistence.repositories.SpringDataH2CarRepository;
import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.entities.Person;
import com.ts.hexagonal.domain.ports.AllocationRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Primary
public class AllocationRepositoryImpl implements AllocationRepository {

    private final SpringDataH2AllocationRepository springDataH2AllocationRepository;

    public AllocationRepositoryImpl(final SpringDataH2AllocationRepository springDataH2AllocationRepository){
        this.springDataH2AllocationRepository = springDataH2AllocationRepository;
    }

    @Override
    public Allocation findById(UUID id) {
        return null;
    }

    @Override
    public Allocation persist(Allocation allocation) {
        return null;
    }

    @Override
    public Allocation update(Allocation allocation) {
        return null;
    }

    @Override
    public List<Allocation> findByPerson(Person person) {
        return null;
    }

    @Override
    public List<Allocation> findByCar(Car car) {
        return null;
    }
}
