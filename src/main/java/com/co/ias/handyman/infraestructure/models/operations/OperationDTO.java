package com.co.ias.handyman.infraestructure.models.operations;

import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;

import java.time.LocalDate;

public class OperationDTO {
    private LocalDate startDate;
    private LocalDate endDate;
    private TechnicianDTO technician;
    private ServiceDTO service;

    public OperationDTO(LocalDate startDate, LocalDate endDate, TechnicianDTO technician, ServiceDTO service) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.technician = technician;
        this.service = service;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
