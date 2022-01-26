package com.emp.repository;

import com.emp.model.RegRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<RegRole, Long> {
}
