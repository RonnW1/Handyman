package com.co.ias.handyman.Operations.application.services;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationEndDate;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdService;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdTechnician;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationStartDate;
import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.Operations.application.ports.output.OperationRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateOperationService implements CreateOperationUseCase {

    private final OperationRepository operationRepository;

    public CreateOperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    @Override
    public OperationDTO execute(OperationDTO operationDTO) {
        Operation operation = new Operation(
                new OperationStartDate( operationDTO.getStartDate() ),
                new OperationEndDate( operationDTO.getEndDate() ),
                new OperationIdService( operationDTO.getService().getIdService() ),
                new OperationIdTechnician( operationDTO.getTechnician().getIdTechnician() )
        );
        operationRepository.store(operation);
        return operationDTO;
    }
}
