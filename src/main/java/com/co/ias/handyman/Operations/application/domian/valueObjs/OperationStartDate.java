package com.co.ias.handyman.Operations.application.domian.valueObjs;

import java.time.LocalDate;

public class OperationStartDate {
    private final LocalDate value;

    public OperationStartDate(LocalDate value) {
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
