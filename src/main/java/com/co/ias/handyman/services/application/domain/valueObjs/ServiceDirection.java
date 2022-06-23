package com.co.ias.handyman.services.application.domain.valueObjs;

public class ServiceDirection {
    private final String value;

    public ServiceDirection(String value) {
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
