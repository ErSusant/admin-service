package com.ebook.management.adminservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

  @GetMapping("/status")
  public ResponseEntity<String> getStatus() {
    return ResponseEntity.ok("Admin service is running");
  }
}
