package ma.khairy.hospital.repository;

import ma.khairy.hospital.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository<Medecin, Long> {
}
