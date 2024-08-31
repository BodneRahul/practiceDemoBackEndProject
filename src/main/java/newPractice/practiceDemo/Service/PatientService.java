package newPractice.practiceDemo.Service;


import newPractice.practiceDemo.Entity.Patient;
import newPractice.practiceDemo.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return patient.orElse(null);
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient patientDetails) {
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            Patient patient = existingPatient.get();
            patient.setPatientName(patientDetails.getPatientName());
            patient.setAge(patientDetails.getAge());
            patient.setSex(patientDetails.getSex());
            patient.setDisease(patientDetails.getDisease());
            patient.setDateOfAdmit(patientDetails.getDateOfAdmit());
            patient.setAssignedDoctor(patientDetails.getAssignedDoctor());
            return patientRepository.save(patient);
        }
        return null;
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}