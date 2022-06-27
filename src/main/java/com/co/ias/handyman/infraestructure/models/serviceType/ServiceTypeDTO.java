package com.co.ias.handyman.infraestructure.models.serviceType;

public class ServiceTypeDTO {
    private Long idServiceType;
    private String description;

    public ServiceTypeDTO(Long idServiceType, String description) {
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
