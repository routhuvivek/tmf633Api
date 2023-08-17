package io.swagger.dao;

import io.swagger.model.ServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCategoryDao extends JpaRepository<ServiceCategory, String> {
}
