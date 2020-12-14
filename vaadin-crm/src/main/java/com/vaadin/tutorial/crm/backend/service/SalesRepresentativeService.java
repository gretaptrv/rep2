package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.Administrator;
import com.vaadin.tutorial.crm.backend.entity.SalesRepresentative;
import com.vaadin.tutorial.crm.backend.repositories.AdministratorRepository;
import com.vaadin.tutorial.crm.backend.repositories.SalesRepresentativeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//TODO: what does logger do?
//TODO: how do I use (long) id and do I need it?

@Service
public class SalesRepresentativeService {
    private static final Logger LOGGER = Logger.getLogger(SalesRepresentativeService.class.getName());
    private SalesRepresentativeRepository salesRepRepository;

    public SalesRepresentativeService(SalesRepresentativeRepository salesRepRepository) {
        this.salesRepRepository = salesRepRepository;
    }

    public List<SalesRepresentative> findAll() {
        return salesRepRepository.findAll();
    }

    public long getCount() {
        return salesRepRepository.count();
    }

    public void delete(SalesRepresentative salesRep) {
        salesRepRepository.delete(salesRep);
    }

    public void save(SalesRepresentative salesRep) {
        if (salesRep == null) {
            LOGGER.log(Level.SEVERE,
                    "Sales Representative is null.");
            return;
        }
        salesRepRepository.save(salesRep);
    }
}
