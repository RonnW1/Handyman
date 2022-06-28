package com.co.ias.handyman.technicians.application.domian.valueObjs;

public class TechnicianId {
    private final Long value;

    public TechnicianId(Long value) {
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
