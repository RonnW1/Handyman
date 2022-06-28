package com.co.ias.handyman.infraestructure.controllers.adapters.output;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLServiceRepository;
import com.co.ias.handyman.infraestructure.adapters.output.jpa.ServiceJpaRepository;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDAO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import com.co.ias.handyman.services.application.domain.Service;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
@ActiveProfiles("test")
public class PostgresSQLServiceRepositoryTest {
    @Mock
    private ServiceJpaRepository jpaRepository;
    @InjectMocks
    private PostgresSQLServiceRepository sqlServiceRepository;
    @Test
    void getByIdTest(){
        Optional<ServiceDAO> serviceDAO = Optional.of(new ServiceDAO(null, "Calle 10", "Mañana", 3,
                new ServiceTypeDAO(1L, "Reparación")));
        when(jpaRepository.findById(2L)).thenReturn(serviceDAO);

        List<Service> services = sqlServiceRepository.getById(2L);
        assertNotNull(services);
        assertEquals(serviceDAO.get().getDirection(),services.get(0).getDirection().toString());
    }
}
