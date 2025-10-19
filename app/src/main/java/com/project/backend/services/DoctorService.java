package com.project.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.project.backend.models.Doctor;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public DoctorService() {
        doctors.add(new Doctor(1, "Dr. Nguyen Van A", "Cardiology", "0123456789", "a@clinic.com"));
        doctors.add(new Doctor(2, "Dr. Tran Thi B", "Pediatrics", "0987654321", "b@clinic.com"));
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    // Get doctor by ID
    public Doctor getDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    // Add a new doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Update existing doctor
    public void updateDoctor(int id, Doctor updatedDoctor) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == id) {
                doctors.set(i, updatedDoctor);
                return;
            }
        }
    }

    // Delete a doctor
    public void deleteDoctor(int id) {
        doctors.removeIf(d -> d.getId() == id);
    }
}
