package com.inpowered.test.services;

import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.Person;
import com.inpowered.test.entities.enums.SexType;

import java.io.IOException;

public interface FileOperations {

    Long count(AddressBook addressBook, SexType sexType);
    Person oldest(AddressBook currentAddressBook);
    Long difference(Person person01, Person person02);
}
