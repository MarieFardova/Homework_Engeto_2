package com.engeto.hotel;


import java.time.LocalDate;

public class Guest {

     String name;
     LocalDate birthDate;


    //constructor
    public Guest(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
};




