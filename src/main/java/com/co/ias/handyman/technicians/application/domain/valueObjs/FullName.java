package com.co.ias.handyman.technicians.application.domain.valueObjs;

public class FullName {
    private final String value;

    public FullName(String value) {
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
