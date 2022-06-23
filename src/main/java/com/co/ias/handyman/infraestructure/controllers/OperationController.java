package com.co.ias.handyman.infraestructure.controllers;

import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.infraestructure.models.ApplicationError;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OperationController {
    private final CreateOperationUseCase createOperationUseCase;

    public OperationController(CreateOperationUseCase createOperationUseCase) {
        this.createOperationUseCase = createOperationUseCase;
    }

    @RequestMapping(value = "/operations", method = RequestMethod.POST)
    public ResponseEntity<?> CreateOperation (@RequestBody OperationDTO operationDTO) {
        try {
            OperationDTO operationDTOOutput = createOperationUseCase.execute(operationDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(operationDTOOutput);
        } catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError", "Bad input data", Map.of("Error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            System.out.println("Error...." + e.getMessage());
            ApplicationError applicationError = new ApplicationError("SystemError", "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }
}
