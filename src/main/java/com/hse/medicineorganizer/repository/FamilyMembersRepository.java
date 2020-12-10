package com.hse.medicineorganizer.repository;

import com.hse.medicineorganizer.model.FamilyMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMembersRepository extends JpaRepository<FamilyMembers,Integer> {

    FamilyMembers getById(Integer id);
}
