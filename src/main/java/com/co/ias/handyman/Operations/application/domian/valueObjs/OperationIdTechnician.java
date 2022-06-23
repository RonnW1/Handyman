package com.co.ias.handyman.Operations.application.domian.valueObjs;

public class OperationIdTechnician {
    private final Long value;

    public OperationIdTechnician(Long value) {
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
