package com.HIMSBackend.HIMSBackend.Repository;

import com.HIMSBackend.HIMSBackend.Model.Hr_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrRepository extends JpaRepository<Hr_Details, Long> {
}
