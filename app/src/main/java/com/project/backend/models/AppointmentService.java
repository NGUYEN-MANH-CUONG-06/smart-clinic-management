package com.project.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.project.backend.models.Appointment;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public AppointmentService() {
        appointments.add(new Appointment(1, 1, 2, "2025-10-20", "10:00 AM"));
        appointments.add(new Appointment(2, 3, 1, "2025-10-22", "2:30 PM"));
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public Appointment getAppointmentById(int id) {
        for (Appointment a : appointments) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void updateAppointment(int id, Appointment updated) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getId() == id) {
                appointments.set(i, updated);
                return;
            }
        }
    }

    public void deleteAppointment(int id) {
        appointments.removeIf(a -> a.getId() == id);
    }
}
