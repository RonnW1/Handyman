package com.co.ias.handyman.technicians.domian;

import com.co.ias.handyman.technicians.domian.valueObjs.TechnicianDocumentNumber;
import com.co.ias.handyman.technicians.domian.valueObjs.TechnicianDocumentType;
import com.co.ias.handyman.technicians.domian.valueObjs.TechnicianFullName;
import com.co.ias.handyman.technicians.domian.valueObjs.TechnicianId;

public class Technician {
    private final TechnicianId id;
    private final TechnicianDocumentType documentType;
    private final TechnicianDocumentNumber documentNumber;
    private final TechnicianFullName fullName;

    public Technician(TechnicianId id, TechnicianDocumentType documentType, TechnicianDocumentNumber documentNumber, TechnicianFullName fullName) {
        this.id = id;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.fullName = fullName;
    }

    public TechnicianId getId() {
        return id;
    }

    public TechnicianDocumentType getDocumentType() {
        return documentType;
    }

    public TechnicianDocumentNumber getDocumentNumber() {
        return documentNumber;
    }

    public TechnicianFullName getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "id=" + id +
                ", documentType=" + documentType +
                ", documentNumber=" + documentNumber +
                ", fullName=" + fullName +
                '}';
    }
}
