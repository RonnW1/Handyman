package com.co.ias.handyman.services.application.services;

import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.serviceTypes.application.domian.ServiceType;
import com.co.ias.handyman.serviceTypes.application.domian.valueObjs.ServiceDescription;
import com.co.ias.handyman.serviceTypes.application.domian.valueObjs.ServiceTypeId;
import com.co.ias.handyman.services.application.domain.Service;
import com.co.ias.handyman.services.application.domain.valueObjs.*;
import com.co.ias.handyman.services.application.ports.output.ServiceRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
@ActiveProfiles("test")
public class QueryAllByIdTest {
    @Mock
    private ServiceRepository repository;

    @InjectMocks
    private QueryAllById allById;

    @Test
    void QueryyAllByIdTest(){
        List<Service> service = new ArrayList<>();
        service.add(new Service(
                new ServiceId(2L),
                new ServiceDirection("Calle 11"),
                new ServiceJornad( "Mañana"),
                new ServiceUser(2),
                new ServiceIdServiceTypes(
                        new ServiceType(new ServiceTypeId(1L),new ServiceDescription("Reparación"))
                )));
        when(repository.getById(2L)).thenReturn(service);
        List<ServiceDTO> dtos = allById.execute(2L);

        assertNotNull(dtos);
        assertEquals(service.get(0).getDirection().toString(),dtos.get(0).getDirection());
    }

}
