package com.ts.hexagonal.adapters.outbound.persistence.repositories;

import com.ts.hexagonal.adapters.outbound.persistence.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataH2PersonRepository extends JpaRepository<PersonEntity, UUID> {
}
