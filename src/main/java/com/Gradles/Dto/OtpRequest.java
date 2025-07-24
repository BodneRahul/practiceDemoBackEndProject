package com.Gradles.Dto;

import jakarta.validation.constraints.Size;

public class OtpRequest {
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Size(min = 10,max = 10,message = "Must 10 Digit")
    private String phoneNumber;
}
