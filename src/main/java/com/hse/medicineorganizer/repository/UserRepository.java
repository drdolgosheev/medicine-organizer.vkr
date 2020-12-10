package com.hse.medicineorganizer.repository;

import com.hse.medicineorganizer.model.Drug;
import com.hse.medicineorganizer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);

    User findByName(String name);

    User getById(Integer id);
}
