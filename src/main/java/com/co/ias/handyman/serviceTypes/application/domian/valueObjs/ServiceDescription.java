package com.co.ias.handyman.serviceTypes.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class ServiceDescription {
    private final String value;

    public ServiceDescription(String value) {
        Validate.notNull(value,"Service type Description cannot be null");
        Validate.isTrue(value.length() <= 15,"Service type Description can not be longer than 15 characters");
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
