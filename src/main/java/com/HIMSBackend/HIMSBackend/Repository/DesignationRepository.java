package com.HIMSBackend.HIMSBackend.Repository;

import com.HIMSBackend.HIMSBackend.Model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {
}
