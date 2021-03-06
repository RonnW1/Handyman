package com.co.ias.handyman.infraestructure.models.operations;

import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OperationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String startDate;

    private String endDate;
    private TechnicianDTO technician;
    private ServiceDTO service;

    public OperationDTO( String startDate, String endDate, TechnicianDTO technician, ServiceDTO service) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.technician = technician;
        this.service = service;
    }

    public OperationDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setTechnician(TechnicianDTO technician) {
        this.technician = technician;
    }

    public void setService(ServiceDTO service) {
        this.service = service;
    }

    public TechnicianDTO getTechnician() {
        return technician;
    }

    public void setIdTechnician(TechnicianDTO technician) {
        this.technician = technician;
    }

    public ServiceDTO getService() {
        return service;
    }

    public void setIdService(ServiceDTO service) {
        this.service = service;
    }
}
