package com.co.ias.handyman.technicians.application.domain.valueObjs;

public class DocumentType {
    private final String value;

    public DocumentType(String value) {
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
