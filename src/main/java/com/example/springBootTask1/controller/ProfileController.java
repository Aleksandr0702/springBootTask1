package com.example.springBootTask1.controller;

import com.example.springBootTask1.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final SystemProfile systemProfile;

    public ProfileController(SystemProfile systemProfile) {
        this.systemProfile = systemProfile;
    }

    @GetMapping("/profile")
    public String getProfile() {
        return systemProfile.getProfile();
    }
}
