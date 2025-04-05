package newPractice.practiceDemo.Service;


import newPractice.practiceDemo.DTO.PatientDto;
import newPractice.practiceDemo.Entity.Patient;
import newPractice.practiceDemo.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Page<Patient> getAllPatients(int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);

        return patientRepository.findAll(pageRequest);
    }

    public PatientDto getPatientById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return patient.map(this::mapToDto).orElse(null);
    }

    public PatientDto savePatient(PatientDto patientDto) {
        Patient patient = mapToEntity(patientDto);
        Patient save = patientRepository.save(patient);
        PatientDto dto = mapToDto(save);
        return dto;
    }

    public PatientDto updatePatient(Long id, PatientDto patientDetails) {
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            Patient patient = existingPatient.get();
            patient.setPatientName(patientDetails.getPatientName());
            patient.setAge(patientDetails.getAge());
            patient.setSex(patientDetails.getSex());
            patient.setDisease(patientDetails.getDisease());
            patient.setDateOfAdmit(patientDetails.getDateOfAdmit());
            patient.setAssignedDoctor(patientDetails.getAssignedDoctor());
            patient.setPhoneNumber(patientDetails.getPhoneNumber());
            patient.setRoom(patientDetails.getRoom());
            patient.setAddress(patientDetails.getAddress());
            patient.setEmail(patientDetails.getEmail());
            patient.setBloodGroup(patientDetails.getBloodGroup());
            Patient save = patientRepository.save(patient);
            return mapToDto(save);
        }
        return null;
    }

    public void deletePatient(Long id) {

        patientRepository.deleteById(id);
    }

    Patient mapToEntity(PatientDto dto) {
        Patient entity = new Patient();
        entity.setAddress(dto.getAddress());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setRoom(dto.getRoom());
        entity.setBloodGroup(dto.getBloodGroup());
        entity.setDisease(dto.getDisease());
        entity.setPatientName(dto.getPatientName());
        entity.setSex(dto.getSex());
        entity.setEmail(dto.getEmail());
        entity.setDateOfAdmit(dto.getDateOfAdmit());
        entity.setAssignedDoctor(dto.getAssignedDoctor());
        entity.setPhoneNumber(dto.getPhoneNumber());
        return entity;
    }

    PatientDto mapToDto(Patient patient) {
        PatientDto dto = new PatientDto();
        dto.setId(patient.getId());
        dto.setAddress(patient.getAddress());
        dto.setAge(patient.getAge());
        dto.setEmail(patient.getEmail());
        dto.setRoom(patient.getRoom());
        dto.setBloodGroup(patient.getBloodGroup());
        dto.setDisease(patient.getDisease());
        dto.setPatientName(patient.getPatientName());
        dto.setSex(patient.getSex());
        dto.setEmail(patient.getEmail());
        dto.setDateOfAdmit(patient.getDateOfAdmit());
        dto.setAssignedDoctor(patient.getAssignedDoctor());
        dto.setPhoneNumber(patient.getPhoneNumber());
        return dto;
    }

}