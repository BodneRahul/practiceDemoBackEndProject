package newPractice.practiceDemo.Controller;

import newPractice.practiceDemo.Entity.Patient;
import newPractice.practiceDemo.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping("/api/patients")
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.getPatientById(id);
        if (patient != null) {
            return new ResponseEntity<>(patient, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientService.savePatient(patient), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient patientDetails) {
        Patient updatedPatient = patientService.updatePatient(id, patientDetails);
        if (updatedPatient != null) {
            return new ResponseEntity<>(updatedPatient, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<Patient>>getPatientsOfDoctor(@PathVariable Long doctorId){
        List<Patient> patientsOfDoctor = patientService.getPatientsOfDoctor(doctorId);
        return new ResponseEntity<>(patientsOfDoctor,HttpStatus.OK);
    }
    @GetMapping("/prescription/{prescriptionId}")
    public ResponseEntity<List<Patient>>getPatientsOfPrescription(@PathVariable Long prescriptionId){
        List<Patient> patientsOfPrescription = patientService.getPatientsOfPrescription(prescriptionId);
        System.out.println(patientsOfPrescription);
        return new ResponseEntity<>(patientsOfPrescription,HttpStatus.OK);

    }
}