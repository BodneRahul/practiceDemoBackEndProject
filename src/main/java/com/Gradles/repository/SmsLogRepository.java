package com.Gradles.repository;

import com.Gradles.Dto.SmsLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsLogRepository extends JpaRepository<SmsLog,Long> {
    long countByPhoneNumberAndType(String phoneNumber, String otp);
}
