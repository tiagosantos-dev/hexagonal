package com.ts.hexagonal.domain.entities;

import com.ts.hexagonal.domain.exceptions.EmailInvalidException;

public class Email {
    private String email;
    public Email(String email) {
        if(!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            throw new EmailInvalidException();
        }else{
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }
}
