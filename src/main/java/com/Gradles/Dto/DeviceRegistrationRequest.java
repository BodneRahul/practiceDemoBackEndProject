package com.Gradles.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DeviceRegistrationRequest {
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @NotBlank(message = "DeviceId is required")
    private String deviceId;
    @Size(min = 10,max = 10,message = "Must 10 Digit")
    private String phoneNumber;
}
