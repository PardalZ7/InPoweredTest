package com.inpowered.test.entities.enums;

import com.inpowered.test.Utils.Messages;
import com.inpowered.test.exceptions.InputExceptions.InvalidInputException;
import com.inpowered.test.exceptions.InputExceptions.InvalidSexTypeException;

public enum SexType {

    MALE (1, "Male"),
    FEMALE (2, "Female");

    private int index;
    private String description;

    SexType(int index, String description) {
        this.index = index;
        this.description = description;
    }

    public static SexType getByIndex(int index) {

        for (SexType sex : SexType.values()) {

            if (sex.index == index)
                return sex;

        }

        return null;

    }

    public static SexType getByDesc(String description) {

        for (SexType sexType : SexType.values()) {

            if (sexType.description.equals(description))
                return sexType;

        }

        throw new InvalidSexTypeException(String.format(Messages.INVALID_SEXTYPE_MESSAGE, description));

    }

    public int getIndex() {
        return index;
    }

    public String getDescription() {
        return description;
    }
}
