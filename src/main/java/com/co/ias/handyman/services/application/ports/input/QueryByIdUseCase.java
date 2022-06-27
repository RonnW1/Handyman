package com.co.ias.handyman.services.application.ports.input;

import com.co.ias.handyman.commons.UseCase;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;

import java.util.List;

public interface QueryByIdUseCase extends UseCase<Long, List<ServiceDTO>> {
}
