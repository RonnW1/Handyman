package com.co.ias.handyman.technicians.application.domain.valueObjs;

public class TechniciansId {
    private final Long value;

    public TechniciansId(Long value) {
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
