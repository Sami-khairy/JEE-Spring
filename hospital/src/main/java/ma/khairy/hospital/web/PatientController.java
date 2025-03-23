package ma.khairy.hospital.web;

import ma.khairy.hospital.entity.Patient;
import ma.khairy.hospital.repository.PatientRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    private PatientRepo patientRepo;

    public PatientController(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }


    @GetMapping("/patients")
    public List<Patient> patientList(){
        return patientRepo.findAll();
    }
}
