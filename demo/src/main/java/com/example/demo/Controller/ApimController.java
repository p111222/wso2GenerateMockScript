package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.ApiService;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class ApimController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/{apiId}/generate-mock-scripts")
    public ResponseEntity<Map<String, Object>> generateMockScripts(@PathVariable String apiId) {
        return apiService.generateMockScripts(apiId);
    }
}