package com.co.ias.handyman.Operations.application.services;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationEndDate;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdService;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationIdTechnician;
import com.co.ias.handyman.Operations.application.domian.valueObjs.OperationStartDate;
import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.Operations.application.ports.output.OperationRepository;
import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLOperationRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateOperationService implements CreateOperationUseCase {

    @Autowired
    private OperationRepository operationRepository;

    @Override
    public Void execute(OperationDTO operationDTO) {
        Optional<Operation> isOperationFound =
                operationRepository.getOperationBetweenDate(operationDTO.getStartDate(), operationDTO.getTechnician().getIdTechnician());
        if(isOperationFound.isPresent()){
            throw new IllegalArgumentException("the current technician has a service already assigned");
        }
        if(operationDTO.getEndDate().isBefore(operationDTO.getStartDate()))
            throw new IllegalArgumentException("the startDate can't be after of endDate");
        Operation operation = new Operation(
                null,
                new OperationStartDate(operationDTO.getStartDate()),
                new OperationEndDate(operationDTO.getEndDate()),
                new OperationIdService(operationDTO.getService().getIdService()),
                new OperationIdTechnician(operationDTO.getTechnician().getIdTechnician())
        );
        operationRepository.store(operation);
        return null;
    }
}
