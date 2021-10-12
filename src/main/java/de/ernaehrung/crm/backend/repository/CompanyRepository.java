package de.ernaehrung.crm.backend.repository;

import de.ernaehrung.crm.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
