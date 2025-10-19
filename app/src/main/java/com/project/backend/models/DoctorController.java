package com.project.backend.controllers;

import java.util.ArrayList;
import java.util.List;

import com.project.backend.models.Doctor;

public class DoctorController {
    private List<Doctor> doctors = new ArrayList<>();

    public DoctorController() {
        doctors.add(new Doctor(1, "Dr. John Doe", "Cardiology", "0123456789", "john@example.com"));
        doctors.add(new Doctor(2, "Dr. Jane Smith", "Dermatology", "0987654321", "jane@example.com"));
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public Doctor getDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void updateDoctor(int id, Doctor updatedDoctor) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == id) {
                doctors.set(i, updatedDoctor);
                return;
            }
        }
    }

    public void deleteDoctor(int id) {
        doctors.removeIf(d -> d.getId() == id);
    }
}
