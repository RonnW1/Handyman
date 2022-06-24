package com.co.ias.handyman.Operations.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class OperationIdTechnician {
    private final Long value;

    public OperationIdTechnician(Long value) {
        Validate.notNull(value, "Id the technician can not be null");
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
