package com.inpowered.test.entities.enums;

import com.inpowered.test.Utils.Messages;
import com.inpowered.test.exceptions.InputExceptions.InvalidInputException;
import com.inpowered.test.exceptions.InputExceptions.InvalidSexTypeException;

public enum SexType {

    MALE ("Male"),
    FEMALE ("Female");

    private String description;

    SexType(String description) {
        this.description = description;
    }

    public static SexType getByDesc(String description) {

        for (SexType sexType : SexType.values()) {

            if (sexType.description.equals(description))
                return sexType;

        }

        throw new InvalidSexTypeException(String.format(Messages.INVALID_INPUT_MESSAGE, description));

    }
}
