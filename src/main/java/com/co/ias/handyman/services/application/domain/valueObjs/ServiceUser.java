package com.co.ias.handyman.services.application.domain.valueObjs;

public class ServiceUser {
    private final Integer value;

    public ServiceUser(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
