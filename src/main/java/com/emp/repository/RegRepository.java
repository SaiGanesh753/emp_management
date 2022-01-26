package com.emp.repository;

import com.emp.model.RegRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegRepository extends JpaRepository<RegRole, Integer> {
    Optional<RegRole> findByRegRoleId(Long regRoleId);
}
