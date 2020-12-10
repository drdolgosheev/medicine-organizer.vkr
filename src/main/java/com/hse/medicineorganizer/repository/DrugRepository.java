package com.hse.medicineorganizer.repository;

import com.hse.medicineorganizer.model.Drug;
import com.hse.medicineorganizer.model.DrugGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrugRepository extends JpaRepository<Drug, Integer> {
    Drug findByName(String name);

    Drug getById(Integer id);

    List<Drug> getAllByDrugGroup(DrugGroup drugGroup);
}
