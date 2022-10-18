package com.inpowered.test.entities.factories;

import com.inpowered.test.entities.AdressBook;
import com.inpowered.test.entities.Person;

import java.util.List;

public class AdressBookBuilder {

    private String filePath;
    private List<Person> people;

    public AdressBookBuilder filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public AdressBookBuilder people(List<Person> people) {
        this.people = people;
        return this;
    }

    public AdressBook build() {
        return new AdressBook(filePath, people);
    }
}
