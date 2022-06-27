package com.co.ias.handyman.Operations.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

import java.time.LocalDate;

public class OperationStartDate {
    private final LocalDate value;

    public OperationStartDate(LocalDate value) {
        Validate.notNull(value, "Start Date can not be null");
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
