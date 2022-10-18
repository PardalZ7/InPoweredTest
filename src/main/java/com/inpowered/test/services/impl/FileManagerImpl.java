package com.inpowered.test.services.impl;

import com.inpowered.test.Utils.DateUtils;
import com.inpowered.test.Utils.Messages;
import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.Person;
import com.inpowered.test.entities.enums.SexType;
import com.inpowered.test.exceptions.InputExceptions.InvalidInputException;
import com.inpowered.test.services.FileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManagerImpl implements FileManager {

    @Override
    public AddressBook readFile(String path) throws IOException {

        AddressBook addressBook = new AddressBook(path);
        Files.lines(Path.of(path)).forEach(line -> addressBook.addPerson(this.readLine(line)));

        return addressBook;

    }

    @Override
    public Person readLine(String line) {

        String[] parts = line.split(",");

        if (parts.length != 3) {
            throw new InvalidInputException(String.format(Messages.INVALID_INPUT_MESSAGE, line));
        }

        return new Person(parts[0].trim(), SexType.getByDesc(parts[1].trim()), DateUtils.getDateFrom(parts[2].trim()));
    }

}
