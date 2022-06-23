package com.co.ias.handyman.Operations.application.domian.valueObjs;

import java.time.LocalDate;

public class OperationEndDate {
    private final LocalDate value;

    public OperationEndDate(LocalDate value) {
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
