package com.co.ias.handyman.infraestructure.models.technicians;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name = "technicians")
public class TechnicianDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTechnician;
    @Column(length = 45, nullable = false)
    private String documentType;
    @Nationalized
    @Column(length = 15, nullable = false)
    private String documentNumber;
    @Column(length = 45, nullable = false)
    private String fullName;

    public TechnicianDAO(Long idTechnician, String documentType, String documentNumber, String fullName) {
        this.idTechnician = idTechnician;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.fullName = fullName;
    }

    public TechnicianDAO() {
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
