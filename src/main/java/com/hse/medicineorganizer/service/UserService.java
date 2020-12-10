package com.hse.medicineorganizer.service;

import com.hse.medicineorganizer.model.User;

import java.util.List;

public interface UserService {
    User register(User user);

    List<User> getAll();

    User findById(Integer id);

    void delete(Integer id);
}
