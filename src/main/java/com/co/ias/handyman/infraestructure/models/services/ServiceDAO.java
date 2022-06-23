package com.co.ias.handyman.infraestructure.models.services;

import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDAO;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Table(name = "Services")
public class ServiceDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    @Column(length = 45, nullable = false)
    private String direction;
    @Column(length = 10, nullable = false)
    private String jornad;
    @Column(nullable = false)
    private Integer user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idServiceType")
    private ServiceTypeDAO idServiceType;

    public ServiceDAO(Long idService, String direction, String jornad, Integer user, ServiceTypeDAO idServiceType) {
        this.idService = idService;
        this.direction = direction;
        this.jornad = jornad;
        this.user = user;
        this.idServiceType = idServiceType;
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

    public String getJornad() {
        return jornad;
    }

    public void setJornad(String jornad) {
        this.jornad = jornad;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public ServiceTypeDAO getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(ServiceTypeDAO idServiceType) {
        this.idServiceType = idServiceType;
    }
}
