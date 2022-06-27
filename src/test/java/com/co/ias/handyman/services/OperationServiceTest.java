package com.co.ias.handyman.services;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLOperationRepository;
import com.co.ias.handyman.infraestructure.adapters.output.jpa.OperationJpaRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDAO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.same;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.time.Month;

@SpringBootTest
public class OperationServiceTest {
    @Mock
    OperationJpaRepository operationJpaRepository;
    @InjectMocks
    PostgresSQLOperationRepository postgresSQLOperationRepository;

    @Test
    @DisplayName("Save operationRepository complete")
    void saveOperation(){
        LocalDateTime startDate = LocalDateTime.of(2022, Month.JUNE, 20, 12,12);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.JUNE, 21, 13,12);
        OperationDAO operationDAO = new OperationDAO(
                startDate,
                endDate,
                new TechnicianDAO(1L, "CC", "documentNumber", "Cristian Camilo Zambrano Grajales"),
                new ServiceDAO(
                        1L,
                        "Calle 10",
                        "Mañana",
                        123,
                        new ServiceTypeDAO(1L, "Reparación")
                )
        );
        operationJpaRepository.save(operationDAO);

        verify(operationJpaRepository).save(same(operationDAO));
    }
}
