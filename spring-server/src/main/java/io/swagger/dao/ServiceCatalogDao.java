package io.swagger.dao;

import io.swagger.model.ServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCatalogDao extends JpaRepository<ServiceCatalog, String> {
}
