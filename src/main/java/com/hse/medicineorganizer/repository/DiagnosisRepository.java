package com.hse.medicineorganizer.repository;

import com.hse.medicineorganizer.model.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis,Integer> {
    Diagnosis findByName(String name);

    Diagnosis getById(Integer id);

    boolean existsById(Integer id);

    void deleteById(Integer id);
}
