package com.co.ias.handyman.Operations.application.services;

import com.co.ias.handyman.Operations.application.ports.output.OperationRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
public class CreateOperationServiceTest {
    @Mock
    private OperationRepository operationRepository;
    @InjectMocks
    private CreateOperationService createOperationService;

    @Test
    @DisplayName("Create Operation Service")
    void craeteOperatioServiceTest(){
        OperationDTO operationDTO = new OperationDTO(
                "2022-06-28T09:02:07.000Z",
                "2022-06-29T06:01:07.000Z",
                new TechnicianDTO(1L,"CC","2123123","pedro"),
                new ServiceDTO(1L, "Calle 10","noche",3,new ServiceTypeDTO(
                        1L,"Reparación"
                )));
        OperationDTO dto = createOperationService.execute(operationDTO);

        assertNotNull(dto);
        assertEquals(operationDTO.getStartDate(),dto.getStartDate());
        assertEquals(operationDTO.getEndDate(),dto.getEndDate());
    }
}
