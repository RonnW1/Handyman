package com.co.ias.handyman.infraestructure.models.operations;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.domian.valueObjs.*;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Operations")
public class OperationDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperation;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime startDate;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_technician")
    private TechnicianDAO idTechnician;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_service")
    private ServiceDAO idService;

    public OperationDAO() {
    }

    public OperationDAO( LocalDateTime startDate, LocalDateTime endDate, TechnicianDAO idTechnician, ServiceDAO idService) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.idTechnician = idTechnician;
        this.idService = idService;
    }

    public Operation toDomain(){
        return new Operation(new OperationId(idOperation), new OperationStartDate(startDate), new OperationEndDate(endDate), new OperationIdService(idService.getIdService()), new OperationIdTechnician(idTechnician.getIdTechnician()));
    }

    public static OperationDAO fromDomain(Operation operation){
        TechnicianDAO technicianDAO = new TechnicianDAO();
        technicianDAO.setIdTechnician(operation.getIdTechnician().getValue());
        ServiceDAO serviceDAO = new ServiceDAO();
        serviceDAO.setIdService(operation.getIdService().getValue());
        return new OperationDAO(
                operation.getStartDate().getValue(),
                operation.getEndDate().getValue(),
                technicianDAO,
                serviceDAO
        );
    }

    public Long getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Long idOperation) {
        this.idOperation = idOperation;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
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
