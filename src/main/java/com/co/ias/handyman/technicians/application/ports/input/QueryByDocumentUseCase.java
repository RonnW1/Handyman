package com.co.ias.handyman.technicians.application.ports.input;

import com.co.ias.handyman.commons.UseCase;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;

import java.util.List;

public interface QueryByDocumentUseCase extends UseCase<String, List<TechnicianDTO>> {
}
