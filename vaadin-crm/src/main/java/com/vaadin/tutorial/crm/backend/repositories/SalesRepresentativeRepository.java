package com.vaadin.tutorial.crm.backend.repositories;

import com.vaadin.tutorial.crm.backend.entity.SalesRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepresentativeRepository extends JpaRepository<SalesRepresentative, Long> {
}
