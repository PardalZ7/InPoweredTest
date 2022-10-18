package com.inpowered.test.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public static LocalDate getDateFrom(String dateStr) {

        String[] parts = dateStr.split("/");

        if (parts[2].length() < 4)
            parts[2] = "19" + parts[2];

        return LocalDate.parse(parts[0] + "/" + parts[1] + "/" + parts[2] , FORMATTER);

    }

    public static String printDate(LocalDate birth) {

        return birth.format(FORMATTER);

    }
}
