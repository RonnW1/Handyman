package com.co.ias.handyman.services.application.domain.valueObjs;

import com.co.ias.handyman.serviceTypes.application.domian.ServiceType;
import org.apache.commons.lang3.Validate;

public class ServiceIdServiceTypes {
    private final ServiceType value;

    public ServiceIdServiceTypes(ServiceType value) {
        Validate.notNull(value, "service types cannot be null");
        this.value = value;
    }

    public ServiceType getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
