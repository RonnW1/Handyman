package com.co.ias.handyman.services.application.ports.output;

import com.co.ias.handyman.services.application.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository {
    List<Service> getById(Long id);
}
