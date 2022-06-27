package com.co.ias.handyman.Operations.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class OperationIdService {
    private final Long value;

    public OperationIdService(Long value) {
        Validate.notNull(value, "Id the Service can not be null");
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
