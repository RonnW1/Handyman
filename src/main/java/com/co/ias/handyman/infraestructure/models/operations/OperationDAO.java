package com.co.ias.handyman.infraestructure.models.operations;

import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Operations")
public class OperationDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperation;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate startDate;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_technician")
    private TechnicianDAO idTechnician;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_service")
    private ServiceDAO idService;

    public OperationDAO() {
    }

    public OperationDAO( LocalDate startDate, LocalDate endDate, TechnicianDAO idTechnician, ServiceDAO idService) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.idTechnician = idTechnician;
        this.idService = idService;
    }

    public Long getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Long idOperation) {
        this.idOperation = idOperation;
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
