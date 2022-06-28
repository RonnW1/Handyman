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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        LocalDateTime startDate = LocalDateTime.parse(LocalDateTime.now().format(formatter));
        LocalDateTime endDate = LocalDateTime.parse(LocalDateTime.now().format(formatter));
        System.out.println(startDate);
        OperationDTO operationDTO = new OperationDTO(
                startDate.toString(),
                endDate.toString(),
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
