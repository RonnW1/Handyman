package com.co.ias.handyman.services.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class ServiceJornad {
    private final String value;

    public ServiceJornad(String value) {
        Validate.notNull(value,"the service day cannot be null");
        Validate.isTrue(value.length() <= 10, "the service day can not be longer than 10 characters");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
