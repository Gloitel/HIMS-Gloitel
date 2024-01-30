package com.HIMSBackend.HIMSBackend.Repository;

import com.HIMSBackend.HIMSBackend.Model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender,Long> {

}
