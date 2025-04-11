package ma.khairy.hopital.repository;

import ma.khairy.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
