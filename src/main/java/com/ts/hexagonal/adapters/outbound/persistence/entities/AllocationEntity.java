package com.ts.hexagonal.adapters.outbound.persistence.entities;

import com.ts.hexagonal.domain.entities.Car;
import com.ts.hexagonal.domain.entities.Person;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name ="tb_allocation")
public class AllocationEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @OneToOne
    private PersonEntity person;

    @OneToOne
    private CarEntity car;
}
