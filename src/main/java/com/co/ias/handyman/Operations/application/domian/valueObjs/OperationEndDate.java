package com.co.ias.handyman.Operations.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

import java.time.LocalDate;

public class OperationEndDate {
    private final LocalDate value;

    public OperationEndDate(LocalDate value) {
        Validate.notNull(value, "End Date can not be null");
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
