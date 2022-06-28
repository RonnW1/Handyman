package com.co.ias.handyman.technicians.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class TechnicianDocumentNumber {
    private final String value;

    public TechnicianDocumentNumber(String value) {
        Validate.notNull(value,"Technician Document Number cannot be null");
        Validate.isTrue(value.length() <= 15,"Technician Document Number can not be longer than 15 characters");
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
