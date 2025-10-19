package com.project.backend.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.backend.services.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{id}/availability")
    public Object getAvailability(@PathVariable Long id, @RequestParam String date, @RequestHeader("Authorization") String token) {
        if (!doctorService.validateToken(token)) return ResponseEntity.status(401).body("Unauthorized");
        return doctorService.getAvailableTimeSlots(id, java.time.LocalDate.parse(date));
    }
}

