package com.inpowered.test.entities;

import java.util.ArrayList;
import java.util.List;

public class AdressBook {

    private String filePath;
    private List<Person> people;

    public AdressBook(String filePath, List<Person> people) {
        this.filePath = filePath;
        this.people = people;
    }

    public AdressBook(String filePath) {
        this.filePath = filePath;
        this.people = new ArrayList<>();
    }

    public AdressBook() {
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
}
