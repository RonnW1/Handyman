package com.co.ias.handyman.services.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class ServiceIdServiceTypes {
    private final Long value;

    public ServiceIdServiceTypes(Long value) {
        Validate.notNull(value, "service types id cannot be null");
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
