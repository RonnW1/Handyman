package com.co.ias.handyman.Operations.application.services;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationEndDate;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdService;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdTechnician;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationStartDate;
import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.Operations.application.ports.output.OperationRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CreateOperationService implements CreateOperationUseCase {

    @Autowired
    private OperationRepository operationRepository;

    @Override
    public OperationDTO execute(OperationDTO operationDTO) {
        Optional<Operation> isOperationFound =
                operationRepository.getOperationBetweenDate(LocalDateTime.parse(operationDTO.getStartDate()), operationDTO.getTechnician().getIdTechnician());
        if(isOperationFound.isPresent()){
            throw new IllegalArgumentException("the current technician has a service already assigned");
        }
        if(LocalDateTime.parse(operationDTO.getEndDate()).isBefore(LocalDateTime.parse(operationDTO.getStartDate())))
            throw new IllegalArgumentException("the startDate can't be after of endDate");
        Operation operation = new Operation(
                null,
                new OperationStartDate(LocalDateTime.parse(operationDTO.getStartDate())),
                new OperationEndDate(LocalDateTime.parse(operationDTO.getEndDate())),
                new OperationIdService(operationDTO.getService().getIdService()),
                new OperationIdTechnician(operationDTO.getTechnician().getIdTechnician())
        );
        operationRepository.store(operation);
        return operationDTO;
    }
}
