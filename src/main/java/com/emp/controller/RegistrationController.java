package com.emp.controller;

import com.emp.EmployeeManagementApp;
import com.emp.model.RegRole;
import com.emp.service.RegService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    public RegService regService;
    Logger log = EmployeeManagementApp.log;

    @GetMapping(value = "/getRole/{roleId}")
    public ResponseEntity<?> getRegRoleData(@PathVariable Long roleId) {
        log.info("fetch role details by id : "+roleId);
        Optional<RegRole> regRole = regService.getRegRoleById(roleId);
        log.info("regRole : "+regRole);
        return new ResponseEntity<>(regRole, HttpStatus.OK);
    }

    @GetMapping(value = "/getAllRoles")
    public ResponseEntity<?> getAllRolesData() {
        log.info("fetching all regRoles...");
        List<RegRole> regRoles = regService.getAllRegRoles();
        return new ResponseEntity<>(regRoles.toString(), HttpStatus.OK);
    }
}
