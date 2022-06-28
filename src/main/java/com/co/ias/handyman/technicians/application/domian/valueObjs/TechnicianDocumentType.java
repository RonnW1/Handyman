package com.co.ias.handyman.technicians.application.domian.valueObjs;

import org.apache.commons.lang3.Validate;

public class TechnicianDocumentType {
    private final String value;

    public TechnicianDocumentType(String value) {
        Validate.notNull(value,"Technician Document Type cannot be null");
        Validate.isTrue(value.length() <= 45,"Technician Document Type can not be longer than 45 characters");
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
