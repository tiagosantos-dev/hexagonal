package com.ts.hexagonal.domain.ports;

import com.ts.hexagonal.domain.entities.Allocation;

public interface AllocationService {

    Allocation createAllocation(Allocation allocation);
}
