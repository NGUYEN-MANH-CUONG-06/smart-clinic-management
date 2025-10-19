package com.project.backend.controllers;

import java.util.List;
import java.util.ArrayList;

import com.project.backend.models.Prescription;

public class PrescriptionController {
    private List<Prescription> prescriptions = new ArrayList<>();

    public PrescriptionController() {
        prescriptions.add(new Prescription(1, 1, 2, "Amoxicillin 500mg", "3 times a day"));
        prescriptions.add(new Prescription(2, 3, 1, "Paracetamol 500mg", "2 times a day"));
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    public Prescription getPrescriptionById(int id) {
        for (Prescription p : prescriptions) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public void updatePrescription(int id, Prescription updatedPrescription) {
        for (int i = 0; i < prescriptions.size(); i++) {
            if (prescriptions.get(i).getId() == id) {
                prescriptions.set(i, updatedPrescription);
                return;
            }
        }
    }

    public void deletePrescription(int id) {
        prescriptions.removeIf(p -> p.getId() == id);
    }
}
