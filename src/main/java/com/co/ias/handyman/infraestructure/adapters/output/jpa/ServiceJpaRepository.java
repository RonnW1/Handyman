package com.co.ias.handyman.infraestructure.adapters.output.jpa;

import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceJpaRepository extends JpaRepository<ServiceDAO, Long> {
}
