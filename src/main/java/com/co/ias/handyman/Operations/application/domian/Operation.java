package com.co.ias.handyman.Operations.application.domian;

import com.co.ias.handyman.Operations.application.domian.valueObjs.*;

public class Operation {
    private final OperationStartDate startDate;
    private final OperationEndDate endDate;
    private final OperationIdService idService;
    private final OperationIdTechnician idTechnician;

    public Operation(OperationStartDate startDate, OperationEndDate endDate, OperationIdService idService, OperationIdTechnician idTechnician) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.idService = idService;
        this.idTechnician = idTechnician;
    }

    public OperationStartDate getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", idService=" + idService +
                ", idTechnician=" + idTechnician +
                '}';
    }
}
