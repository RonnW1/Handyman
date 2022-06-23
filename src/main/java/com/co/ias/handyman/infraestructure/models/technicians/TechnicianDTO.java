package com.co.ias.handyman.infraestructure.models.technicians;

import javax.persistence.Column;

public class TechnicianDTO {
    private Long idTechnician;
    private String documentType;
    private String documentNumber;
    private String fullName;

    public TechnicianDTO(Long idTechnician, String documentType, String documentNumber, String fullName) {
        this.idTechnician = idTechnician;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.fullName = fullName;
    }

    public Long getIdTechnician() {
        return idTechnician;
    }

    public void setIdTechnician(Long idTechnician) {
        this.idTechnician = idTechnician;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
