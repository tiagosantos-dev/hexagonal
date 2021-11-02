package com.ts.hexagonal.adapters.outbound.persistence.implementations;

import com.ts.hexagonal.adapters.outbound.persistence.entities.PersonEntity;
import com.ts.hexagonal.adapters.outbound.persistence.repositories.SpringDataH2PersonRepository;
import com.ts.hexagonal.domain.entities.Email;
import com.ts.hexagonal.domain.entities.Person;
import com.ts.hexagonal.domain.ports.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Primary
public class PersonRepositoryImpl implements PersonRepository {
    private SpringDataH2PersonRepository springDataH2PersonRepository;

    public PersonRepositoryImpl(final SpringDataH2PersonRepository springDataH2PersonRepository ){
        this.springDataH2PersonRepository = springDataH2PersonRepository;
    }

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Person findById(UUID id) {
        return null;
    }

    @Override
    public Person persist(Person person) {
        PersonEntity personEntity =  modelMapper.map(person, PersonEntity.class);
        personEntity = springDataH2PersonRepository.save(personEntity);
        return modelMapper.map(personEntity, Person.class);
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public List<Person> findByEmail(Email email) {
        return null;
    }
}
