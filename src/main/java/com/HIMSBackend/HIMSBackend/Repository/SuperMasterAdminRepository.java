package com.HIMSBackend.HIMSBackend.Repository;

import com.HIMSBackend.HIMSBackend.Model.SuperMasterAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperMasterAdminRepository extends JpaRepository<SuperMasterAdmin, Long> {
}
