package com.co.ias.handyman.services.application.services;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLServiceRepository;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.services.application.ports.input.QueryByIdUseCase;
import com.co.ias.handyman.services.application.ports.output.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryAllById implements QueryByIdUseCase {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<ServiceDTO> execute(Long id) {

        return serviceRepository.getById(id).stream().map(ServiceDTO::fromDomain).collect(Collectors.toList());
    }
}
