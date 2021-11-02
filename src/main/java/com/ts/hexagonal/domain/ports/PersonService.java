package com.ts.hexagonal.domain.ports;

import com.ts.hexagonal.domain.entities.Person;

public interface PersonService {

    Person createPerson(Person person);
}
