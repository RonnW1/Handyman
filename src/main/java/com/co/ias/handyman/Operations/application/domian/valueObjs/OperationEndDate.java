package com.co.ias.handyman.Operations.application.domian.valueObjs;

import java.util.Date;

public class OperationEndDate {
    private final Date value;

    public OperationEndDate(Date value) {
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
