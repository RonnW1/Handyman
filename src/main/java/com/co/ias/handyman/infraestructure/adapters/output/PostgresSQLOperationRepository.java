package com.co.ias.handyman.infraestructure.adapters.output;


import com.co.ias.handyman.infraestructure.models.operations.OperationDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresSQLOperationRepository extends JpaRepository<OperationDAO, Long> {

}
