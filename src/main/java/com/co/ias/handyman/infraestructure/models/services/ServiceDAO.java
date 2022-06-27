package com.co.ias.handyman.infraestructure.models.services;

import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDAO;
import com.co.ias.handyman.serviceTypes.application.domian.ServiceType;
import com.co.ias.handyman.serviceTypes.application.domian.valueObjs.ServiceDescription;
import com.co.ias.handyman.serviceTypes.application.domian.valueObjs.ServiceTypeId;
import com.co.ias.handyman.services.application.domain.Service;
import com.co.ias.handyman.services.application.domain.valueObjs.*;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Table(name = "services")
public class ServiceDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    @Column(length = 45, nullable = false)
    private String direction;
    @Column(length = 10, nullable = false)
    private String journey;
    @Column(nullable = false)
    private Integer userNumber;
    @ManyToOne
    @JoinColumn(name = "id_service_type")
    private ServiceTypeDAO idServiceType;

    public ServiceDAO(Long idService, String direction, String journey, Integer userNumber, ServiceTypeDAO idServiceType) {
        this.idService = idService;
        this.direction = direction;
        this.journey = journey;
        this.userNumber = userNumber;
        this.idServiceType = idServiceType;
    }

    public Service toDomain(){
        ServiceType serviceType = new ServiceType(
                new ServiceTypeId(idServiceType.getIdServiceType()),
                new ServiceDescription(idServiceType.getDescription())
        );
        return new Service(
                new ServiceId(idService),
                new ServiceDirection(direction),
                new ServiceJornad(journey),
                new ServiceUser(userNumber),
                new ServiceIdServiceTypes(serviceType));
    }

    public ServiceDAO() {
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

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public ServiceTypeDAO getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(ServiceTypeDAO idServiceType) {
        this.idServiceType = idServiceType;
    }
}
