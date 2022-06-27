package com.co.ias.handyman.controller;

import com.co.ias.handyman.Operations.application.ports.input.CreateOperationUseCase;
import com.co.ias.handyman.infraestructure.controllers.OperationController;
import com.co.ias.handyman.infraestructure.models.operations.OperationDTO;
import com.co.ias.handyman.infraestructure.models.serviceType.ServiceTypeDTO;
import com.co.ias.handyman.infraestructure.models.services.ServiceDTO;
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
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.time.LocalDateTime;
import java.time.Month;

@WebMvcTest(OperationController.class)
public class OperationControllerTest {
    @MockBean
    private CreateOperationUseCase createOperationUseCase;
    @MockBean
    private QueryByDocumentUseCase queryByDocumentUseCase;
    @MockBean
    private QueryAllById queryAllById;
    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Save operation completed")
    void saveOperation() throws Exception {
        LocalDateTime startDate = LocalDateTime.of(2022, Month.JUNE, 20, 12,12);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.JUNE, 21, 13,12);
        OperationDTO operationDTO = new OperationDTO(
                startDate,
                endDate,
                new TechnicianDTO(1L, "CC", "documentNumber", "Cristian Camilo Zambrano Grajales"),
                new ServiceDTO(
                        1L,
                        "Calle 10",
                        "Mañana",
                        123,
                        new ServiceTypeDTO(1L, "Reparación")
                )
        );
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        this.mockMvc.perform(post("/operations").contentType(MediaType.APPLICATION_JSON).content(mapper.writeValueAsString(operationDTO)))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @DisplayName("Get technicians Success")
    void getTechnicians() throws Exception{

    }


}
