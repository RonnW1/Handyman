package com.co.ias.handyman.services.application.domain.valueObjs;

public class ServiceJornad {
    private final String value;

    public ServiceJornad(String value) {
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
