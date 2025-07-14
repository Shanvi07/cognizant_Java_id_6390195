package com.cognizant.spring_jwt_custom.controller;

import com.cognizant.spring_jwt_custom.util.jwthelper;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/auth")
public class LoginAuthController {

    @Autowired
    private JwtTokenHelper jwtTokenHelper;

    @GetMapping("/login")
    public TokenResponse authenticateUser(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Authorization header missing or not Basic");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.decodeBase64(base64Credentials));
        String[] creds = credentials.split(":", 2);

        String username = creds[0];
        String password = creds[1];

        // Replace this check with a real user validation in production
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtTokenHelper.generateToken(username);
            return new TokenResponse(token);
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

    public static class TokenResponse {
        private String token;

        public TokenResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}