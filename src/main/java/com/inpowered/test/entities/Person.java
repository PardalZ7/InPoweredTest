package com.inpowered.test.entities;

import com.inpowered.test.entities.enums.SexType;
import com.inpowered.test.entities.factories.PersonBuilder;

import java.time.LocalDate;

public class Person {

    private String name;
    private SexType sexType;
    private LocalDate birth;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public Person(String name, SexType sexType, LocalDate birth) {
        this.name = name;
        this.sexType = sexType;
        this.birth = birth;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexType getSexType() {
        return sexType;
    }

    public void setSexType(SexType sexType) {
        this.sexType = sexType;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

}
