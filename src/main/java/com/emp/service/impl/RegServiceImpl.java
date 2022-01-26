package com.emp.service.impl;

import com.emp.model.RegRole;
import com.emp.repository.RegRepository;
import com.emp.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegServiceImpl implements RegService {

    @Autowired
    RegRepository regRepository;

    @Override
    public Optional<RegRole> getRegRoleById(Long regRoleId) {
        return regRepository.findByRegRoleId(regRoleId);
    }

    @Override
    public List<RegRole> getAllRegRoles() {
        return regRepository.findAll();
    }
}
