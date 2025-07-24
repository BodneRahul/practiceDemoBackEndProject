package com.Gradles.controller;

import com.Gradles.Dto.DeviceWebhookPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
    @PostMapping("/device-registered")
    public ResponseEntity<String> receiveDeviceRegistration(@RequestBody DeviceWebhookPayload payload) {
        System.out.println("Webhook Received:");
        System.out.println("Device ID: " + payload.getDeviceId());
        System.out.println("Phone Number: " + payload.getPhoneNumber());
        System.out.println();
        return ResponseEntity.ok("Webhook received successfully.");
    }
}