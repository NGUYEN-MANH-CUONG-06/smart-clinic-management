package com.project.backend.repositories;

import java.util.ArrayList;
import java.util.List;

import com.project.backend.models.Patient;

public class PatientRepository {
    private List<Patient> patients = new ArrayList<>();

    public PatientRepository() {
        patients.add(new Patient(1, "Nguyen Van A", "1990-05-10", "0123456789", "a@gmail.com"));
        patients.add(new Patient(2, "Tran Thi B", "1988-09-22", "0987654321", "b@gmail.com"));
    }

    public List<Patient> findAll() {
        return patients;
    }

    public Patient findById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void save(Patient patient) {
        patients.add(patient);
    }

    public void update(int id, Patient updatedPatient) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                patients.set(i, updatedPatient);
                return;
            }
        }
    }

    public void delete(int id) {
        patients.removeIf(p -> p.getId() == id);
    }
}
