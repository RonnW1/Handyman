package com.co.ias.handyman.services.application.domain.valueObjs;

public class ServiceIdServiceTypes {
    private final Long value;

    public ServiceIdServiceTypes(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
