package com.co.ias.handyman.technicians.application.services;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLTechnicalRepository;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.co.ias.handyman.technicians.application.ports.input.QueryByDocumentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryAllByDocument implements QueryByDocumentUseCase {
    @Autowired
    private PostgresSQLTechnicalRepository postgresSQLTechnicalRepository;
    @Override
    public List<TechnicianDTO> execute(String s) {
        List<TechnicianDTO> technicianDTOList =  postgresSQLTechnicalRepository.findByDocument(s).stream().map(technicianDAO ->
                new TechnicianDTO(
                        technicianDAO.getIdTechnician(),
                        technicianDAO.getDocumentType(),
                        technicianDAO.getDocumentNumber(),
                        technicianDAO.getFullName()
                )
        ).collect(Collectors.toList());
        return technicianDTOList;
    }
}
