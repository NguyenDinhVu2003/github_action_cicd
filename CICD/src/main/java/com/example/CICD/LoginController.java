package com.example.CICD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User userRequest) {
        User user = userRepository.findByUsername(userRequest.getUsername());
        if (user != null && user.getPassword().equals(userRequest.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid credentials.";
        }
    }
    @PostMapping("/signup")
    public String signup(@RequestBody User userRequest) {
        if (userRepository.findByUsername(userRequest.getUsername()) != null) {
            return "Username already exists.";
        }
        userRepository.save(userRequest);
        return "Signup successful!";
    }
}