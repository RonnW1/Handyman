package com.co.ias.handyman.Operations.application.domian.valueObjs;

import java.util.Date;

public class OperationStartDate {
    private final Date value;

    public OperationStartDate(Date value) {
        this.value = value;
    }

    public Date getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
