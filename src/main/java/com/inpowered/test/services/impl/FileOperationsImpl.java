package com.inpowered.test.services.impl;

import com.inpowered.test.Utils.DateUtils;
import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.Person;
import com.inpowered.test.entities.enums.SexType;
import com.inpowered.test.services.FileOperations;

public class FileOperationsImpl implements FileOperations {

    @Override
    public Long count(AddressBook addressBook, SexType sexType) {

        return addressBook.getPeople().stream().filter(person -> person.getSexType().equals(sexType)).count();

    }

    @Override
    public Person oldest(AddressBook addressBook) {

        return addressBook.getPeople().stream().sorted((o1, o2) -> o1.getBirth().compareTo(o2.getBirth()))
                .findFirst().orElse(null);

    }

    @Override
    public Long difference(Person person01, Person person02) {

        return DateUtils.differenceInDays(person01.getBirth(), person02.getBirth());

    }
}
