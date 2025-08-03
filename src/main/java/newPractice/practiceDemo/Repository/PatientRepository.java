package newPractice.practiceDemo.Repository;


import newPractice.practiceDemo.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient>findByDoctorId(Long doctorId);
    List<Patient>findByPrescriptionId(Long prescriptionId);
}
