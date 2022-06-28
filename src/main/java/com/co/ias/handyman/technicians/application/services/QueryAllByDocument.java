package com.co.ias.handyman.technicians.application.services;

import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.co.ias.handyman.technicians.application.ports.output.TechnicalRepository;
import com.co.ias.handyman.technicians.application.ports.input.QueryByDocumentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryAllByDocument implements QueryByDocumentUseCase {
    @Autowired
    private TechnicalRepository technicalRepository;
    @Override
    public List<TechnicianDTO> execute(String s) {
        return technicalRepository.getAllByDocument(s).stream().map(TechnicianDTO::fromDomain).collect(Collectors.toList());
    }
}
