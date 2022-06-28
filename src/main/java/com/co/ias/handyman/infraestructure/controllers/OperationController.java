package com.co.ias.handyman.infraestructure.controllers;

import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.infraestructure.models.ApplicationError;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.co.ias.handyman.services.application.services.QueryAllById;
import com.co.ias.handyman.technicians.application.ports.input.QueryByDocumentUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class OperationController {
    private final CreateOperationUseCase createOperationUseCase;
    private final QueryByDocumentUseCase queryByDocumentUseCase;
    private final QueryAllById queryAllById;

    public OperationController(CreateOperationUseCase createOperationUseCase, QueryByDocumentUseCase queryByDocumentUseCase, QueryAllById queryAllById) {
        this.createOperationUseCase = createOperationUseCase;
        this.queryByDocumentUseCase = queryByDocumentUseCase;
        this.queryAllById = queryAllById;
    }

    @RequestMapping(value = "/operations", method = RequestMethod.POST)
    public ResponseEntity<?> CreateOperation (@RequestBody OperationDTO operationDTO) {
        try {
            createOperationUseCase.execute(operationDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError", "Bad input data", Map.of("Error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            System.out.println("Error...." + e.getMessage());
            ApplicationError applicationError = new ApplicationError("SystemError", "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }

    @RequestMapping(value = "/technicians/{document}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllTechnicians (@PathVariable String document){
        try {
            List<TechnicianDTO> technicianDTOList = queryByDocumentUseCase.execute(document);
            return ResponseEntity.ok(technicianDTOList);
        }catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError", "Bad input data", Map.of("Error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            System.out.println("Error...." + e.getMessage());
            ApplicationError applicationError = new ApplicationError("SystemError", "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }

    @RequestMapping(value = "/services/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllServices (@PathVariable Long id){
        try {
            List<ServiceDTO> serviceDTOList = queryAllById.execute(id);
            return ResponseEntity.ok(serviceDTOList);
        }catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError", "Bad input data", Map.of("Error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            System.out.println("Error...." + e.getMessage());
            ApplicationError applicationError = new ApplicationError("SystemError", "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }
}
