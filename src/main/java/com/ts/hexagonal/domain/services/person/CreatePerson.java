package com.ts.hexagonal.domain.services.person;

import com.ts.hexagonal.domain.entities.Person;
import com.ts.hexagonal.domain.ports.CarRepository;
import com.ts.hexagonal.domain.ports.PersonRepository;

public class CreatePerson {
    private final PersonRepository personRepository;

   public CreatePerson(PersonRepository personRepository){
       this.personRepository = personRepository;
   }

   public Person createPerson(Person person){
       return personRepository.persist(person);
   }

}
