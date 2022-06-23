package com.co.ias.handyman.infraestructure.models.operations;

import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Operations")
public class OperationDAO {
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate startDate;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTechnician")
    private TechnicianDAO idTechnician;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idService")
    private ServiceDAO idService;

    public OperationDAO(LocalDate startDate, LocalDate endDate, TechnicianDAO idTechnician, ServiceDAO idService) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.idTechnician = idTechnician;
        this.idService = idService;
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

    public TechnicianDAO getIdTechnician() {
        return idTechnician;
    }

    public void setIdTechnician(TechnicianDAO idTechnician) {
        this.idTechnician = idTechnician;
    }

    public ServiceDAO getIdService() {
        return idService;
    }

    public void setIdService(ServiceDAO idService) {
        this.idService = idService;
    }
}
