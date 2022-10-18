package com.inpowered.test.services.impl;

import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.enums.SexType;
import com.inpowered.test.services.FileOperations;

public class FileOperationsImpl implements FileOperations {
    @Override
    public Long count(AddressBook addressBook, SexType sexType) {

        return addressBook.getPeople().stream().filter(person -> person.getSexType().equals(sexType)).count();

    }
}
