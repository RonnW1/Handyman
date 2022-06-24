package com.co.ias.handyman.infraestructure.models.services;

import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;

import java.io.Serializable;

public class ServiceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idService;
    private String direction;
    private String journey;
    private Integer user;
    private ServiceTypeDTO idServiceType;

    public ServiceDTO(Long idService, String direction, String journey, Integer user, ServiceTypeDTO idServiceType) {
        this.idService = idService;
        this.direction = direction;
        this.journey = journey;
        this.user = user;
        this.idServiceType = idServiceType;
    }

    public ServiceDTO() {
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public ServiceTypeDTO getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(ServiceTypeDTO idServiceType) {
        this.idServiceType = idServiceType;
    }
}
