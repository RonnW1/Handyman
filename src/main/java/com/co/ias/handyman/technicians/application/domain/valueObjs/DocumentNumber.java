package com.co.ias.handyman.technicians.application.domain.valueObjs;

public class DocumentNumber {
    private final String value;

    public DocumentNumber(String value) {
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
