package com.co.ias.handyman.infraestructure.controllers.adapters.output;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLTechnicalRepository;
import com.co.ias.handyman.infraestructure.adapters.output.jpa.TechnicalJpaRepository;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import com.co.ias.handyman.technicians.application.domian.Technician;
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
public class PostgresSQLTechnicalRepositoryTest {
    @Mock
    private TechnicalJpaRepository jpaRepository;
    @InjectMocks
    private PostgresSQLTechnicalRepository technicalRepository;
    @Test
    void getAllByDocumentTest(){
        List<TechnicianDAO> technicians2 = new ArrayList<>();
        technicians2.add(new TechnicianDAO(4L,"CC","78956453","Sammy Steven MuÃ±oz Hidalgo"));
        when(jpaRepository.findByDocument("78956453")).thenReturn(technicians2);

        List<Technician> technicians = technicalRepository.getAllByDocument("78956453");

        assertNotNull(technicians);
        assertEquals(technicians2.get(0).getDocumentNumber(),technicians.get(0).getDocumentNumber().toString());
    }

}
