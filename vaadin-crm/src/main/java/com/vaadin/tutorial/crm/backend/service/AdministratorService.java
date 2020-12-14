package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.Administrator;
import com.vaadin.tutorial.crm.backend.repositories.AdministratorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//TODO: do i need id?
// do i need more functionality?

@Service
public class AdministratorService {
    private static final Logger LOGGER = Logger.getLogger(AdministratorService.class.getName());
    private AdministratorRepository adminRepository;

    public AdministratorService(AdministratorRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Administrator> findAll() {
        return adminRepository.findAll();
    }

    public long getCount() {
        return adminRepository.count();
    }

    public void delete(Administrator admin) {
        adminRepository.delete(admin);
    }

    public void save(Administrator admin) {
        if (admin == null) {
            LOGGER.log(Level.SEVERE,
                    "Administrator is null.");
            return;
        }
        adminRepository.save(admin);
    }

}
