package com.co.ias.handyman.serviceTypes.application.domian.valueObjs;

public class ServiceDescription {
    private final String value;

    public ServiceDescription(String value) {
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
