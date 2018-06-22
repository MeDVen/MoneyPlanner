package ru.medven.moneyplanner.entity;

/**
 * Operation type.
 * Created by medven on 18.12.16.
 */
public enum Operation {

    PLUS("+"),
    MINUS("-");

    public static Operation[] operations = new Operation[] { PLUS, MINUS };

    private String name;

    Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
