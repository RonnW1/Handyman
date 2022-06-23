package com.co.ias.handyman.Operations.application.domian;

import com.co.ias.handyman.Operations.application.domian.valueObjs.*;

public class Operation {
    private final OperationId id;
    private final OperationStartDate startDate;
    private final OperationEndDate endDate;
    private final OperationIdService idService;
    private final OperationIdTechnician idTechnician;

    public Operation(OperationId id, OperationStartDate startDate, OperationEndDate endDate, OperationIdService idService, OperationIdTechnician idTechnician) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idService = idService;
        this.idTechnician = idTechnician;
    }

    public OperationId getId() {
        return id;
    }

    public OperationStartDate getStartDate() {
        return startDate;
    }

    public OperationEndDate getEndDate() {
        return endDate;
    }

    public OperationIdService getIdService() {
        return idService;
    }

    public OperationIdTechnician getIdTechnician() {
        return idTechnician;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", idService=" + idService +
                ", idTechnician=" + idTechnician +
                '}';
    }
}
