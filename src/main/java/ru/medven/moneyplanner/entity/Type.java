package ru.medven.moneyplanner.entity;

/**
 * Money operation type.
 * Created by medven on 18.12.16.
 */
public enum Type {

    DEBIT("Debit"),
    CREDIT("Credit");

    private String name;

    Type(String name) {
        this.name = name;
    }
}
