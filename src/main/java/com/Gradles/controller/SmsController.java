package com.Gradles.controller;

import com.Gradles.Dto.DeviceRegistrationRequest;
import com.Gradles.Dto.OtpRequest;
import com.Gradles.Dto.SmsLog;
import com.Gradles.service.MockSmsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sms")
public class SmsController {
    @Autowired
    private MockSmsService mockSmsService;
    @PostMapping("/register")
    public ResponseEntity<String>registerDevice(@Valid  @RequestBody DeviceRegistrationRequest request){
        return ResponseEntity.ok(mockSmsService.registerDevice(request));
    }
    @PostMapping("/otp")
    public ResponseEntity<String>sendOtp(@Valid @RequestBody OtpRequest request){
        return ResponseEntity.ok(mockSmsService.sendOtp(request));
    }
    @GetMapping("/logs")
    public ResponseEntity<List<SmsLog>>getAllLogs(){
        return ResponseEntity.ok(mockSmsService.getAllSmsLogs());
    }
}
