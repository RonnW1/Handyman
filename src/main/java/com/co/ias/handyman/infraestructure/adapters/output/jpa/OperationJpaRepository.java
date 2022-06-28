package com.co.ias.handyman.infraestructure.adapters.output.jpa;

import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface OperationJpaRepository extends JpaRepository<OperationDAO, Long> {
    @Query("select o from OperationDAO o where o.startDate <= ?1 and o.endDate >= ?1 and o.idTechnician.idTechnician = ?2")
    public Optional<OperationDAO> findBetweenDates(LocalDateTime date, Long idTechnician);
}
