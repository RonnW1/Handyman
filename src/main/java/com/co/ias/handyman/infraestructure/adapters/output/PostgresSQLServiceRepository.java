package com.co.ias.handyman.infraestructure.adapters.output;

import com.co.ias.handyman.infraestructure.adapters.output.jpa.ServiceJpaRepository;
import com.co.ias.handyman.services.application.domain.Service;
import com.co.ias.handyman.services.application.ports.output.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostgresSQLServiceRepository implements ServiceRepository {
    @Autowired
    private ServiceJpaRepository serviceJpaRepository;
    @Override
    public List<Service> getById(Long id) {
        return serviceJpaRepository.findById(id).stream().map(serviceDAO -> serviceDAO.toDomain()).collect(Collectors.toList());
    }
}
