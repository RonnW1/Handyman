package com.co.ias.handyman.technicians.application.services;

import com.co.ias.handyman.infraestructure.adapters.output.PostgresSQLTechnicalRepository;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.co.ias.handyman.technicians.application.domian.Technician;
import com.co.ias.handyman.technicians.application.domian.valueObjs.TechnicianDocumentNumber;
import com.co.ias.handyman.technicians.application.domian.valueObjs.TechnicianDocumentType;
import com.co.ias.handyman.technicians.application.domian.valueObjs.TechnicianFullName;
import com.co.ias.handyman.technicians.application.domian.valueObjs.TechnicianId;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ActiveProfiles("test")
@DataJpaTest
public class QueryAllByDocumentTest {

    @Mock
    private PostgresSQLTechnicalRepository sqlTechnicalRepository;
    @InjectMocks
    private QueryAllByDocument queryAllByDocument;

    @Test
    void QueryyAllByDocumentTest(){
        Technician technician = new Technician(
                new TechnicianId(1L),
                new TechnicianDocumentType("CC"),
                new TechnicianDocumentNumber("1152987324"),
                new TechnicianFullName("Cristian Camilo Zambrano Grajales"));
        List<Technician> value = new ArrayList<>();
        value.add(technician);
        when(sqlTechnicalRepository.getAllByDocument("1152987324")).thenReturn(value);

        List<TechnicianDTO> technicians = queryAllByDocument.execute(technician.getDocumentNumber().toString());
        assertTrue(technicians.size() > 0);
        assertEquals(value.get(0).getDocumentNumber().toString(),technicians.get(0).getDocumentNumber());
    }
}
