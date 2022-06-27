package com.co.ias.handyman.services.application.services;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLServiceRepository;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.services.application.ports.input.QueryByIdUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryAllById implements QueryByIdUseCase {
    @Autowired
    private PostgresSQLServiceRepository postgresSQLServiceRepository;

    @Override
    public List<ServiceDTO> execute(Long id) {
        List<ServiceDTO> serviceDTOList =  postgresSQLServiceRepository.findById(id).stream().map(
                serviceDAO ->
                        new ServiceDTO(
                                serviceDAO.getIdService(),
                                serviceDAO.getDirection(),
                                serviceDAO.getJourney(),
                                serviceDAO.getUserNumber(),
                                new ServiceTypeDTO(serviceDAO.getIdServiceType().getIdServiceType(), serviceDAO.getIdServiceType().getDescription())
                        )
        ).collect(Collectors.toList());
        return serviceDTOList;
    }
}
