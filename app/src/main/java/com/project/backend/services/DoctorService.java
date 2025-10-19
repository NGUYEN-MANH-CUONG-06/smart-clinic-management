package com.project.backend.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.backend.repositories.DoctorRepository;
import com.project.backend.models.Doctor;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private TokenService tokenService;

    public boolean validateLogin(String email, String password) {
        Doctor d = doctorRepository.findByEmail(email).orElse(null);
        return d != null && d.getPassword().equals(password);
    }

    public List<String> getAvailableTimeSlots(Long id, LocalDate date) {
        // implement or mock availability
        return List.of("09:00", "10:00", "14:00");
    }
}

