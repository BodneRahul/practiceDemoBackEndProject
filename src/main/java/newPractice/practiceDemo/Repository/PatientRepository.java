package newPractice.practiceDemo.Repository;


import newPractice.practiceDemo.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
