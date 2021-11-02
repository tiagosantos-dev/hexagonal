package com.ts.hexagonal.domain.services.allocation;

import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.ports.AllocationRepository;

public class CreateAllocation {
    private final AllocationRepository allocationRepository;

    public CreateAllocation(AllocationRepository allocationRepository){
        this.allocationRepository = allocationRepository;
    }

    public Allocation createAllocation(Allocation allocation){
       return allocationRepository.persist(allocation);
    }

}
