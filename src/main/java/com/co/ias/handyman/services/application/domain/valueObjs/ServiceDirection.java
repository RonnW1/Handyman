package com.co.ias.handyman.services.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class ServiceDirection {
    private final String value;

    public ServiceDirection(String value) {
        Validate.notNull(value, "service address cannot be null");
        Validate.isTrue(value.length() <= 45, "service address can not be longer than 45 characters");
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
