package com.hse.medicineorganizer.service.implementation;

import com.hse.medicineorganizer.model.User;
import com.hse.medicineorganizer.repository.DrugRepository;
import com.hse.medicineorganizer.repository.UserRepository;
import com.hse.medicineorganizer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;
    private DrugRepository drugRepository;

    @Override
    public User register(User user) {

        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
