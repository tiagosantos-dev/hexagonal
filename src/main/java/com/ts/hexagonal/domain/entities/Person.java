package com.ts.hexagonal.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private String phone;
    private Email email;
    private LocalDate birthDate;
}
