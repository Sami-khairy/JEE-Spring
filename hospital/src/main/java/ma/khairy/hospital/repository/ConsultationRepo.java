package ma.khairy.hospital.repository;

import ma.khairy.hospital.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation, Long> {
}
