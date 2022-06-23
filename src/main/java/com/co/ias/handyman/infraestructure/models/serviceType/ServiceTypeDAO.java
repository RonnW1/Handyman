package com.co.ias.handyman.infraestructure.models.serviceType;

import javax.persistence.*;

@Entity
@Table(name = "ServiceTypes")
public class ServiceTypeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceType;
    @Column(length = 15, nullable = false)
    private String description;

    public ServiceTypeDAO(Long idServiceType, String description) {
        this.idServiceType = idServiceType;
        this.description = description;
    }

    public Long getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(Long idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
