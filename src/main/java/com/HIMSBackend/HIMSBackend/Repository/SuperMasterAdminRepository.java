package com.HIMSBackend.HIMSBackend.Repository;

import com.HIMSBackend.HIMSBackend.Model.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperMasterAdminRepository extends JpaRepository<SuperAdmin, Long> {
}
