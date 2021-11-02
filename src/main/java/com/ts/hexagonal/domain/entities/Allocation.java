package com.ts.hexagonal.domain.entities;

import com.ts.hexagonal.domain.exceptions.AllocationFailed;

import java.util.UUID;

public class Allocation {
    private UUID id;
    private Person person;
    private Car car;

    public Allocation(UUID id, Person person, Car car){
        if(person == null || car == null){
             throw new AllocationFailed();
        }else{
            this.id = id;
            this.person = person;
            this.car = car;
        }

    }

}
