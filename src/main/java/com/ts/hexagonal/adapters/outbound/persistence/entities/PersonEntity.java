package com.ts.hexagonal.adapters.outbound.persistence.entities;

import com.ts.hexagonal.domain.entities.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="tb_person")
public class PersonEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    private String phone;
    private String email;
    private LocalDate birthDate;

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
}
