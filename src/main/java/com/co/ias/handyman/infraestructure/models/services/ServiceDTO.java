package com.co.ias.handyman.infraestructure.models.services;

import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.serviceTypes.application.domian.ServiceType;
import com.co.ias.handyman.services.application.domain.Service;

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

    public static ServiceDTO fromDomain(Service service){
        ServiceTypeDTO serviceTypeDTO = new ServiceTypeDTO();
        serviceTypeDTO.setIdServiceType(service.getIdServiceTypes().getValue().getId().getValue());
        serviceTypeDTO.setDescription(service.getIdServiceTypes().getValue().getDescription().getValue());

        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setIdService(service.getId().getValue());
        serviceDTO.setDirection(service.getDirection().getValue());
        serviceDTO.setJourney(service.getJourney().getValue());
        serviceDTO.setUser(service.getUser().getValue());
        serviceDTO.setIdServiceType(serviceTypeDTO);
        return  serviceDTO;
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
