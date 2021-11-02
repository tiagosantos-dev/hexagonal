package com.ts.hexagonal.domain.ports;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.entities.Email;
import com.ts.hexagonal.domain.entities.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface PersonRepository {

    Person findById(UUID id);
    Person persist(Person person);
    List<Person> findAll();
    List<Person> findByEmail(Email email);
}
