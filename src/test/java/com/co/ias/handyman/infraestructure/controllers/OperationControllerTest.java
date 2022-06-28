package com.co.ias.handyman.infraestructure.controllers;

import com.co.ias.handyman.Operations.application.services.CreateOperationService;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDTO;
import com.co.ias.handyman.services.application.services.QueryAllById;
import com.co.ias.handyman.technicians.application.ports.input.QueryByDocumentUseCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ActiveProfiles("test")
@WebMvcTest(OperationController.class)
public class OperationControllerTest {
    @MockBean
    private CreateOperationService createOperation;
    @MockBean
    private QueryByDocumentUseCase queryByDocumentUseCase;
    @MockBean
    private QueryAllById queryAllById;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Create operation completed")
    void CreateOperation() throws Exception {
        LocalDateTime startDate = LocalDateTime.of(2022, Month.JUNE, 20, 12,12);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.JUNE, 21, 13,12);
        
        OperationDTO operationDTO = new OperationDTO(
                startDate.toString(),
                endDate.toString(),
                new TechnicianDTO(1L,"Cedula","1004829045","Pepe"),
                new ServiceDTO(1L,"Carrera 21 #54 -76","mañana",3,
                        new ServiceTypeDTO(1L,"Reparación")));
        
        when(createOperation.execute(operationDTO)).thenReturn(operationDTO);
        ObjectMapper mapper = new ObjectMapper();

        //validation
        this.mockMvc.perform(post("/operations").contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(operationDTO)))
                .andDo(print())
                .andExpect(status().isCreated());

    }

    @Test
    @DisplayName("getAllTechnicians")
    void getAllTechnicians() throws Exception {
        TechnicianDTO technicianDTO = new TechnicianDTO(1L,"CC","1007234234","pedro");
        List<TechnicianDTO> technicianDTOS = new ArrayList<>();
        technicianDTOS.add(technicianDTO);
       when(queryByDocumentUseCase.execute(technicianDTO.getDocumentNumber())).thenReturn(technicianDTOS);
        ObjectMapper mapper = new ObjectMapper();

        this.mockMvc.perform(get("/technicians/"+technicianDTO.getIdTechnician()).contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(technicianDTO)))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
