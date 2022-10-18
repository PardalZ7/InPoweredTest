package com.inpowered.test;

import com.inpowered.test.Utils.Messages;
import com.inpowered.test.config.AppConfig;
import com.inpowered.test.entities.AddressBook;
import com.inpowered.test.entities.enums.Option;
import com.inpowered.test.entities.enums.SexType;
import com.inpowered.test.services.FileManager;
import com.inpowered.test.services.FileOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = {AppConfig.class})
public class Application implements CommandLineRunner {

    public static AddressBook CURRENT_ADDRESS_BOOK;
    public static final Scanner sc = new Scanner(System.in);

    @Autowired
    private FileManager fileManager;

    @Autowired
    private FileOperations fileOperations;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        CURRENT_ADDRESS_BOOK = null;

        Option option = printMessage();
        while ((option == null) || (!option.equals(Option.EXIT))) {

            if (option != null) {

                System.out.println(String.format(Messages.OPTION_SELECTED_MESSAGE, option.getDescription()));
                if (option.equals(Option.READFILE)) {
                    readFile();
                } else if (option.equals(Option.SHOWFILE)) {
                    printFile();
                } else if (option.equals(Option.COUNT)) {
                    count();
                }

            } else {
                System.out.println(Messages.INVALID_OPTION_MESSAGE);
            }

            option = printMessage();

        }

    }

    private void count() {

        if (CURRENT_ADDRESS_BOOK == null) {
            System.out.println(Messages.MISSING_FILE);
            return;
        }

        System.out.println(Messages.CHOOSE_SEX_MESSAGE);
        for (SexType sex : SexType.values())
            System.out.println(sex.getIndex() + "- " + sex.getDescription());

        SexType sexType = SexType.getByIndex(sc.nextInt());
        System.out.println(String.format(Messages.COUNT_SEX_RESULT,
                fileOperations.count(CURRENT_ADDRESS_BOOK, sexType), sexType));

    }

    private void printFile() {

        if (CURRENT_ADDRESS_BOOK == null) {
            System.out.println(Messages.MISSING_FILE);
        } else {
            System.out.println(CURRENT_ADDRESS_BOOK);
        }

    }

    private void readFile() {

        System.out.println(Messages.WRITE_FILE_PATH);
        try {
            String path = sc.next();
            CURRENT_ADDRESS_BOOK = fileManager.readFile("C:\\Users\\alexa\\Downloads\\AddressBook.txt");
            System.out.println(String.format(Messages.FILE_SUCCESSFULLE_PARSED, path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private Option printMessage() {

        System.out.println(Messages.CHOOSE_OPTION_MESSAGE);
        for (Option opt : Option.values())
            System.out.println(opt.getIndex() + "- " + opt.getDescription());

        return Option.getByIndex(sc.nextInt());

    }

}
