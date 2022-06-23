package com.co.ias.handyman.Operations.application.domian.valueObjs;

public class OperationIdService {
    private final Long value;

    public OperationIdService(Long value) {
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
