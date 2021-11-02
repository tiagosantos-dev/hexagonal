package com.ts.hexagonal.domain.services.allocation;

import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.ports.AllocationRepository;

public class AllocationService {
    private final AllocationRepository allocationRepository;

    public AllocationService(AllocationRepository allocationRepository){
        this.allocationRepository = allocationRepository;
    }

    public Allocation createAllocation(Allocation allocation){
       return allocationRepository.persist(allocation);
    }

}
