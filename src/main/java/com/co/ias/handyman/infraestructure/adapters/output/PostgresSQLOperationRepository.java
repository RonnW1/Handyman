package com.co.ias.handyman.infraestructure.adapters.output;


import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.ports.output.OperationRepository;
import com.co.ias.handyman.infraestructure.adapters.output.jpa.OperationJpaRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class PostgresSQLOperationRepository implements OperationRepository {
    @Autowired
    private OperationJpaRepository operationJpaRepository;

    @Override
    public void store(Operation operation) {
        operationJpaRepository.save(OperationDAO.fromDomain(operation));
    }

    @Override
    public List<Operation> getAll() {
        return null;
    }

    @Override
    public Optional<Operation> getOperationBetweenDate(LocalDateTime dateTime, Long idTechnician) {
        try {

            Operation operation = operationJpaRepository.findBetweenDates(dateTime, idTechnician)
                    .map(operationDAO -> {
                        if (operationDAO != null)
                            return operationDAO.toDomain();
                        else
                            return null;
                    }).orElse(null);
            return operation != null ?  Optional.of(operation) : Optional.empty();
        } catch (Exception e) {
            System.out.println(e);
            return Optional.empty();
        }
    }
}
