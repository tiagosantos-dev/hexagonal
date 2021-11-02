package com.ts.hexagonal.adapters.outbound.persistence;

import com.ts.hexagonal.adapters.outbound.persistence.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataH2CarRepository extends JpaRepository<CarEntity, UUID> {

}
