package com.ts.hexagonal.domain.entities;

import com.ts.hexagonal.domain.exceptions.EmailInvalidException;

public class Email {
    private String email;
    private String  regexEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public Email(){}
    public Email(String email) {
        if(!email.matches(regexEmail)){
            throw new EmailInvalidException();
        }else{
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public Boolean isEmailValid(){
        return this.email.matches(regexEmail);

    }
}
