package com.inpowered.test.entities.factories;

import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.Person;

import java.util.List;

public class AddressBookBuilder {

    private String filePath;
    private List<Person> people;

    public AddressBookBuilder filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public AddressBookBuilder people(List<Person> people) {
        this.people = people;
        return this;
    }

    public AddressBook build() {
        return new AddressBook(filePath, people);
    }
}
