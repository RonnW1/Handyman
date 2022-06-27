package com.co.ias.handyman.infraestructure.adapters.output.jpa;

import com.co.ias.handyman.infraestructure.models.technicians.TechnicianDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicalJpaRepository extends JpaRepository<TechnicianDAO, Long> {
    @Query("select t from TechnicianDAO t where t.documentNumber like %?1%")
    public List<TechnicianDAO> findByDocument(String term);
}
