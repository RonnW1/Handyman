package com.co.ias.handyman.serviceTypes.application.domian.valueObjs;

public class ServiceTypeId {
    private final Long value;

    public ServiceTypeId(Long value) {
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
