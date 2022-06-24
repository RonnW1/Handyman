package com.co.ias.handyman.services.application.domain;

import com.co.ias.handyman.services.application.domain.valueObjs.*;

public class service {
    private final ServiceId id;
    private final ServiceDirection direction;
    private final ServiceJornad journey;
    private final ServiceUser user;
    private final ServiceIdServiceTypes idServiceTypes;

    public service(ServiceId id, ServiceDirection direction, ServiceJornad journey, ServiceUser user, ServiceIdServiceTypes idServiceTypes) {
        this.id = id;
        this.direction = direction;
        this.journey = journey;
        this.user = user;
        this.idServiceTypes = idServiceTypes;
    }

    public ServiceId getId() {
        return id;
    }

    public ServiceDirection getDirection() {
        return direction;
    }

    public ServiceJornad getJourney() {
        return journey;
    }

    public ServiceUser getUser() {
        return user;
    }

    public ServiceIdServiceTypes getIdServiceTypes() {
        return idServiceTypes;
    }

    @Override
    public String toString() {
        return "service{" +
                "id=" + id +
                ", direction=" + direction +
                ", journey=" + journey +
                ", user=" + user +
                ", idServiceTypes=" + idServiceTypes +
                '}';
    }
}
