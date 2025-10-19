package com.project.backend.services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenService {
    private Map<String, String> tokens = new HashMap<>();

    // Generate a new token for a given username
    public String generateToken(String username) {
        String token = UUID.randomUUID().toString();
        tokens.put(token, username);
        return token;
    }

    // Validate if a token is valid
    public boolean validateToken(String token) {
        return tokens.containsKey(token);
    }

    // Get username by token
    public String getUsernameFromToken(String token) {
        return tokens.get(token);
    }

    // Invalidate a token (logout)
    public void invalidateToken(String token) {
        tokens.remove(token);
    }
}
