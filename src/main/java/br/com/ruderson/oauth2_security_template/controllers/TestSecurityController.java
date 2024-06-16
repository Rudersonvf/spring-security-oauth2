package br.com.ruderson.oauth2_security_template.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestSecurityController {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String> admin() {
        return ResponseEntity.ok("Protected resource, Only admin can access");
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping("/user")
    public ResponseEntity<String> user() {
        return ResponseEntity.ok("Protected resource, only logged users can access");
    }


    @GetMapping("/free")
    public ResponseEntity<String> Unsecure() {
        return ResponseEntity.ok("Unsecure resource, anyone can access");
    }

}
