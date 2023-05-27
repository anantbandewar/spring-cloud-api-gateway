package io.infinity.billingprofileservice.controller;

import io.infinity.billingprofileservice.dto.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to Billing Profile Service";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> details(@PathVariable("id") String id) {
        return ResponseEntity.ok(new Profile(id, "Sample profile"));
    }
}
