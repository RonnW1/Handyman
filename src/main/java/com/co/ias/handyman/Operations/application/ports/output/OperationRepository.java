package com.co.ias.handyman.Operations.application.ports.output;

import com.co.ias.handyman.Operations.application.domian.Operation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OperationRepository {
    void store (Operation operation);
    List<Operation> getAll();
    Optional<Operation> getOperationBetweenDate(LocalDateTime dateTime, Long idTechnician);
}
