package com.inpowered.test;

import com.inpowered.test.config.AppConfig;
import com.inpowered.test.entities.enums.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.util.Scanner;
import java.util.stream.Stream;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = {AppConfig.class})
public class Application implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        Option option = printMessage();
        while ((option == null) || (!option.equals(Option.EXIT))) {

            if (option != null) {

                System.out.println("\nOption '" + option.getDescription() + "'\n");

            } else {
                System.out.println("\nInvalid option\n");
            }

            option = printMessage();

        }

    }

    private Option printMessage() {

        System.out.println("Choose a option below:");
        for (Option opt : Option.values())
            System.out.println(opt.getIndex() + "- " + opt.getDescription());

        Scanner sc = new Scanner(System.in);
        return Option.getByIndex(sc.nextInt());

    }

}
