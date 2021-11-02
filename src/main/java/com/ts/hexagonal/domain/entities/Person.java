package com.ts.hexagonal.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private String phone;
    private String email;
    private LocalDate birthDate;

    public Person(){}

    public Person(UUID id, String name, String phone, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }




    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email=" + email +
                ", birthDate=" + birthDate +
                '}';
    }
}
