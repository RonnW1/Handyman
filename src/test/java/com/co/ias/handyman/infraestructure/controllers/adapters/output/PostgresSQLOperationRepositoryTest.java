package com.co.ias.handyman.infraestructure.controllers.adapters.output;

import com.co.ias.handyman.Operations.application.domian.Operation;
import com.co.ias.handyman.Operations.application.domian.valueObjs.*;
import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLOperationRepository;
import com.co.ias.handyman.infraestructure.adapters.output.jpa.OperationJpaRepository;
import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDAO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
@ActiveProfiles("test")
public class PostgresSQLOperationRepositoryTest {
    @Mock
    private OperationJpaRepository operationJpaRepositoryRepository;
    @InjectMocks
    private PostgresSQLOperationRepository postgresSQLServiceRepository;

    @Test
    void createOperationTest(){
        LocalDateTime startDate = LocalDateTime.of(2022, Month.JUNE, 20, 12,12);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.JUNE, 21, 13,12);
        OperationDAO operationDAO = new OperationDAO(
                startDate,
                endDate,
                new TechnicianDAO(1L,"Cedula","2030432949","pepe"),
                new ServiceDAO(1L,"Calle 10","Mañana",123,
                        new ServiceTypeDAO(1L,"Reparación")));
        when(operationJpaRepositoryRepository.save(operationDAO)).thenReturn(operationDAO);
        postgresSQLServiceRepository.store(operationDAO.toDomain());

    }

    @Test
    void getOperationBetweenDateTest(){
        LocalDateTime startDate = LocalDateTime.of(2022, Month.JUNE, 20, 12,12);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.JUNE, 21, 13,12);
        Optional<OperationDAO> operationDao = Optional.of(new OperationDAO(
                startDate,
                endDate,
                new TechnicianDAO(1L,"CC","12132","pepe"),
                new ServiceDAO(1L,"Calle 10","Mañana",3,
                        new ServiceTypeDAO(1L,"Reparación"))
        ));
        when(operationJpaRepositoryRepository.findBetweenDates(startDate, 1L)).thenReturn(operationDao);

        Optional<Operation> operationGet = postgresSQLServiceRepository.getOperationBetweenDate(startDate,1L);

        assertNotNull(operationGet);
        assertEquals(operationDao.get().toDomain().getStartDate().toString(),operationGet.get().getStartDate().toString());
    }

    @Test
    void GetAll(){
        List<Operation> list = postgresSQLServiceRepository.getAll();
        assertEquals(null,list);
    }
}
