package com.co.ias.handyman.infraestructure.adapters.output;

import com.co.ias.handyman.infraestructure.models.services.ServiceDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresSQLServiceRepository extends JpaRepository<ServiceDAO, Long> {
}
