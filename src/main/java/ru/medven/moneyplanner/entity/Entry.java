package ru.medven.moneyplanner.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Operation table entry.
 * Created by medven on 18.12.16.
 */
public class Entry {

    private String name;
    private BigDecimal value;
    private Operation operation;
    private Timestamp date;
    private Type type;

    /**
     * Main constructor with initialize of all fields.
     * @param name name of operation
     * @param value value of operation
     * @param operation operation
     * @param date date of operation
     * @param type type of operation
     */
    public Entry(String name, BigDecimal value, Operation operation, Timestamp date, Type type) {
        this.name = name;
        this.value = value;
        this.operation = operation;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
