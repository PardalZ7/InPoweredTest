package com.inpowered.test.entities.enums;

public enum SexType {

    MALE ("Male"),
    FEMALE ("Female");

    private String description;

    SexType(String description) {
        this.description = description;
    }

}
