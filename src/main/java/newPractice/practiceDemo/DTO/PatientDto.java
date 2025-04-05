package newPractice.practiceDemo.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class PatientDto {
    private Long id;

    private String patientName;
    private int age;
    private String sex;
    private String disease;

    private Date dateOfAdmit;
    private String assignedDoctor;
    private String room;
    private String address;
    private String phoneNumber;
    private String email;
    private String bloodGroup;
}
