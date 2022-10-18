package com.inpowered.test.entities;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private String filePath;
    private List<Person> people;

    public AddressBook(String filePath, List<Person> people) {
        this.filePath = filePath;
        this.people = people;
    }

    public AddressBook(String filePath) {
        this.filePath = filePath;
        this.people = new ArrayList<>();
    }

    public AddressBook() {
        this.people = new ArrayList<>();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {

        this.people.add(person);

    }

    @Override
    public String toString() {

        StringBuilder outPut = new StringBuilder(this.filePath + "\n");

        this.people.stream().forEach(person -> outPut.append(person + "\n"));

        return outPut.toString();

    }
}
