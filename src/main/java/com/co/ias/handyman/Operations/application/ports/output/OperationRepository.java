package com.co.ias.handyman.Operations.application.ports.output;

import com.co.ias.handyman.Operations.application.domian.Operation;

import java.util.Optional;

public interface OperationRepository {
    void store (Operation operation);
    Optional<Operation> getAll();
}
