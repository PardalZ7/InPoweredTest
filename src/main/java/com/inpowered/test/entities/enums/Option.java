package com.inpowered.test.entities.enums;

public enum Option {

    READFILE(1, "Read File"),
    SHOWFILE(2, "Print File"),
    MALECOUNT(3, "How many males"),
    OLDEST(4, "The oldest person"),
    DIFF(5, "Difference between Bill and Paul"),
    EXIT(9, "Exit");

    private int index;
    private String description;

    Option(int index, String description) {
        this.index = index;
        this.description = description;
    }

    public static Option getByIndex(int index) {

        for (Option opt : Option.values()) {

            if (opt.getIndex() == index)
                return opt;

        }

        return null;

    }

    public int getIndex() {
        return index;
    }

    public String getDescription() {
        return description;
    }

}
