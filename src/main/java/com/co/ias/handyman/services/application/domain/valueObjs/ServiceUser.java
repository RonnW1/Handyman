package com.co.ias.handyman.services.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class ServiceUser {
    private final Integer value;

    public ServiceUser(Integer value) {
        Validate.notNull(value, "Service user cannot be null");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
