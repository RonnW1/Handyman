package com.co.ias.handyman.Operations.application.services;

import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLOperationRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOperationService implements CreateOperationUseCase {

    @Autowired
    PostgresSQLOperationRepository postgresSQLServiceRepository;

    @Override
    public Void execute(OperationDTO operationDTO) {
        TechnicianDAO technicianDAO = new TechnicianDAO();
        technicianDAO.setIdTechnician(operationDTO.getTechnician().getIdTechnician());
        ServiceDAO serviceDAO = new ServiceDAO();
        serviceDAO.setIdService(operationDTO.getService().getIdService());
        postgresSQLServiceRepository.save(
                new OperationDAO(
                        operationDTO.getStartDate(),
                        operationDTO.getEndDate(),
                        technicianDAO,
                        serviceDAO));

        return null;
    }
}
