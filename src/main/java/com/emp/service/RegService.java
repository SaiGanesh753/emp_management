package com.emp.service;

import com.emp.model.RegRole;

import java.util.List;
import java.util.Optional;

public interface RegService {
    public Optional<RegRole> getRegRoleById(Long regRoleId);
    public List<RegRole> getAllRegRoles();
}
