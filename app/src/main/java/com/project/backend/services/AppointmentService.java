package com.project.backend.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.backend.repositories.AppointmentRepository;
import com.project.backend.models.Appointment;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment bookAppointment(Appointment a) {
        return appointmentRepository.save(a);
    }
    // other methods...
}

