package com.co.ias.handyman.serviceTypes.application.domian;

import com.co.ias.handyman.serviceTypes.application.domian.valueObjs.*;

public class ServiceType {
    private final ServiceTypeId id;
    private final ServiceDescription description;

    public ServiceType(ServiceTypeId id, ServiceDescription description) {
        this.id = id;
        this.description = description;
    }

    public ServiceTypeId getId() {
        return id;
    }

    public ServiceDescription getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "id=" + id +
                ", description=" + description +
                '}';
    }
}
