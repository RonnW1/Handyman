package com.co.ias.handyman.infraestructure.adapters.output;

import com.co.ias.handyman.infraestructure.adapters.output.jpa.TechnicalJpaRepository;
import com.co.ias.handyman.technicians.application.domian.Technician;
import com.co.ias.handyman.technicians.application.ports.output.TechnicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostgresSQLTechnicalRepository implements TechnicalRepository {

    @Autowired
    private TechnicalJpaRepository technicalRepository;

    @Override
    public List<Technician> getAllByDocument(String document) {
        List<Technician>  technicianList =  technicalRepository.findByDocument(document).stream().map(technicianDAO -> technicianDAO.toDomain()).collect(Collectors.toList());
        return technicianList;
    }
}
