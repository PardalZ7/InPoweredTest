package com.inpowered.test.entities.factories;

import com.inpowered.test.entities.Person;
import com.inpowered.test.entities.enums.SexType;

import java.time.LocalDate;

public class PersonBuilder {

    private String name;
    private SexType sexType;
    private LocalDate birth;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder sexType(SexType sexType) {
        this.sexType = sexType;
        return this;
    }

    public PersonBuilder birth(LocalDate birth) {
        this.birth = birth;
        return this;
    }

    public Person build() {
        return new Person(name, sexType, birth);
    }

}
