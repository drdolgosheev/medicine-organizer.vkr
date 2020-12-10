package com.hse.medicineorganizer.service;

import com.hse.medicineorganizer.model.Diagnosis;
import com.hse.medicineorganizer.model.Drug;
import com.hse.medicineorganizer.model.User;

import java.util.List;

public interface UserService {
    User register(User user);

    User findById(Integer id);

    List<User> getAll();

    List<Drug> getUserMedKit(Integer id);

    List<Diagnosis> getUserDiagnosis(Integer id);

    void delete(Integer id);
}
