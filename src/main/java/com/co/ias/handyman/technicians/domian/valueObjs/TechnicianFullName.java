package com.co.ias.handyman.technicians.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class TechnicianFullName {
    private final String value;

    public TechnicianFullName(String value) {
        Validate.notNull(value,"Technician FullName cannot be null");
        Validate.isTrue(value.length() <= 45,"Technician FullName can not be longer than 45 characters");
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
