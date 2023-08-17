package io.swagger.dao;

import io.swagger.model.ServiceSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceSpecificationDao extends JpaRepository<ServiceSpecification,String> {
}
