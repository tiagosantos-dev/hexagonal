package com.ts.hexagonal.domain.services.allocation;

import com.ts.hexagonal.domain.entities.Allocation;
import com.ts.hexagonal.domain.ports.AllocationRepository;
import com.ts.hexagonal.domain.ports.AllocationService;

public class AllocationServiceImpl implements AllocationService {
    private final AllocationRepository allocationRepository;

    public AllocationServiceImpl(AllocationRepository allocationRepository){
        this.allocationRepository = allocationRepository;
    }

    public Allocation createAllocation(Allocation allocation){
       return allocationRepository.persist(allocation);
    }

}
