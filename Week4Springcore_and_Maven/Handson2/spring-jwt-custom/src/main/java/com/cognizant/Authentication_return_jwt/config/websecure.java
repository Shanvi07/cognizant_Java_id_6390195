package com.cognizant.spring_jwt_custom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class websecure {

    // Security filter chain to configure access rules
    @Bean
    public SecurityFilterChain configureHttpSecurity(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/auth/login").permitAll() // Open login endpoint
                        .anyRequest().authenticated()                   // Secure everything else
                )
                .httpBasic(Customizer.withDefaults()) // Basic Auth setup
                .csrf(csrf -> csrf.disable())         // Disable CSRF for APIs
                .build();
    }

    // In-memory user setup for demo/testing purposes
    @Bean
    public InMemoryUserDetailsManager inMemoryUsers() {
        UserDetails defaultUser = User.builder()
                .username("user")
                .password("{noop}pwd") // Plain text password (not for production)
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(defaultUser);
    }
}