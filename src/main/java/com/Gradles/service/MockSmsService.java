package com.Gradles.service;

import com.Gradles.Dto.DeviceRegistrationRequest;
import com.Gradles.Dto.DeviceWebhookPayload;
import com.Gradles.Dto.OtpRequest;
import com.Gradles.Dto.SmsLog;
import com.Gradles.repository.SmsLogRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class MockSmsService {
    @Autowired
    private SmsLogRepository smsLogRepository;
    @Autowired
    private RestTemplate restTemplate;
   @Value("${webhook.device.registration.url}")
   private String webhookUrl;

    public String registerDevice(DeviceRegistrationRequest request) {
       String msg = "Device" + request.getDeviceId()+"registerd successfully for " + request.getPhoneNumber();
//       smsLogs.add(new SmsLog("Device Registration",request.getPhoneNumber(),msg));
        SmsLog Log =new SmsLog();
        Log.setType("Device_Registration");
        Log.setPhoneNumber(request.getPhoneNumber());
        Log.setMessage(msg);
        smsLogRepository.save(Log);
        //call webhhook
        DeviceWebhookPayload payload = new DeviceWebhookPayload();
        payload.setDeviceId(request.getDeviceId());
        payload.setPhoneNumber(request.getPhoneNumber());

        try {
            restTemplate.postForObject(webhookUrl, payload, String.class);
        } catch (Exception e) {
            return "Device registered but webhook failed: " + e.getMessage();
        }
       //return msg;
        return "Device registered and webhook triggered.";
    }

    public String sendOtp(OtpRequest request) {
        String phone = request.getPhoneNumber();

        // Count how many OTPs have already been sent to this phone number
        long otpCount = smsLogRepository.countByPhoneNumberAndType(phone, "OTP");

        if (otpCount >= 3) {
            return "OTP limit reached. You can only request OTP 3 times.";
        }
        String otp = String.valueOf(new Random().nextInt(900000)+100000);
        String msg="YOUR OTP IS: "+ otp;
        //smsLogs.add(new SmsLog("OTP",request.getPhoneNumber(),msg));
        SmsLog Log= new SmsLog();
        Log.setType("OTP");
        Log.setPhoneNumber(request.getPhoneNumber());
        Log.setMessage(msg);
        smsLogRepository.save(Log);
        return msg;
    }

    public List<SmsLog> getAllSmsLogs() {
        return smsLogRepository.findAll();
    }
}
