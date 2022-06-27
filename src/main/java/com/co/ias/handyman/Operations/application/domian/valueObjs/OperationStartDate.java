package com.co.ias.handyman.Operations.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;

public class OperationStartDate {
    private final LocalDateTime value;

    public OperationStartDate(LocalDateTime value) {
        LocalDateTime today = LocalDateTime.now();
        Validate.notNull(value, "Start Date can not be null");
        Validate.isTrue(today.isAfter(value), "The Date can't be later than current date");
        this.value = value;
    }

    public LocalDateTime getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
