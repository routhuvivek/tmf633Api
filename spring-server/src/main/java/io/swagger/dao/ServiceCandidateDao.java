package io.swagger.dao;

import io.swagger.model.ServiceCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCandidateDao extends JpaRepository<ServiceCandidate, String> {
}
