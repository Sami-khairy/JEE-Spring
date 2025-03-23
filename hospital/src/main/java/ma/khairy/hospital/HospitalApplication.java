package ma.khairy.hospital;


import ma.khairy.hospital.entity.Patient;
import ma.khairy.hospital.repository.PatientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}


	@Bean
	CommandLineRunner start(PatientRepo patientRepo){
		return args -> {
			Stream.of("Sami","Saad","Alaa")
					.forEach(name -> {
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setMalade(false);
						patient.setDateNaissance(new Date());
						patientRepo.save(patient);
					});
		};
	}

}
