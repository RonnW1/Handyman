package com.co.ias.handyman.technicians.application.ports.output;

import com.co.ias.handyman.technicians.application.domian.Technician;

import java.util.List;

public interface
TechnicalRepository {
    List<Technician> getAllByDocument(String document);
}
