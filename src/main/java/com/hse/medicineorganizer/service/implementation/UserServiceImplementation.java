package com.hse.medicineorganizer.service.implementation;

import com.hse.medicineorganizer.model.Diagnosis;
import com.hse.medicineorganizer.model.Drug;
import com.hse.medicineorganizer.model.Status;
import com.hse.medicineorganizer.model.User;
import com.hse.medicineorganizer.repository.DiagnosisRepository;
import com.hse.medicineorganizer.repository.DrugRepository;
import com.hse.medicineorganizer.repository.UserRepository;
import com.hse.medicineorganizer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final DrugRepository drugRepository;
    private final DiagnosisRepository diagnosisRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    public UserServiceImplementation(UserRepository userRepository, DrugRepository drugRepository,
                                     DiagnosisRepository diagnosisRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.drugRepository = drugRepository;
        this.diagnosisRepository = diagnosisRepository;
        this.passwordEncoder = passwordEncoder;

        log.info("Info");

    }

    @Override
    public User register(User user) {
        user.setStatus(Status.ACTIVE);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        User regUser = userRepository.save(user);

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

    @Override
    public List<Drug> getUserMedKit(Integer id) {
        return null;
    }

    @Override
    public List<Diagnosis> getUserDiagnosis(Integer id) {
        return null;
    }
}
