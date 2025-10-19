package com.project.backend.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.backend.services.PrescriptionService;
import com.project.backend.models.Prescription;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping
    public ResponseEntity<?> save(@RequestHeader("Authorization") String token, @RequestBody Prescription p) {
        if (!prescriptionService.validateToken(token)) return ResponseEntity.status(401).body("Invalid token");
        return ResponseEntity.ok(prescriptionService.save(p));
    }
}

