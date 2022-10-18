package com.inpowered.test.services;

import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.Person;

import java.io.IOException;

public interface FileManager {

    AddressBook readFile(String path) throws IOException;
    Person readLine(String line);

}
