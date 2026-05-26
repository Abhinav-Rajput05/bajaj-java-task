package com.example.bajaj_java.controller;

import com.example.bajaj_java.dto.bajajRequest;
import com.example.bajaj_java.dto.bajajResponse;
import com.example.bajaj_java.service.bajajService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class bajajController {

    private final bajajService bajajService;

    public bajajController(bajajService bajajService) {
        this.bajajService = bajajService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/bfhl")
    public ResponseEntity<bajajResponse> handleBajajRequest(@RequestBody bajajRequest request) {
        bajajResponse response = bajajService.processData(request);
        return ResponseEntity.ok(response);
    }
}