package ma.khairy.hopital;

import ma.khairy.hopital.entities.Patient;
import ma.khairy.hopital.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            Patient patient = Patient.builder()
                    .name("khairy")
                    .dateNaissance(new Date())
                    .malade(false)
                    .scope(100)
                    .build();
            patientRepository.save(patient);
            patientRepository.save(Patient.builder().name("mohamed").dateNaissance(new Date()).malade(true).scope(70).build());
            patientRepository.save(Patient.builder().name("imane").dateNaissance(new Date()).malade(true).scope(120).build());

            patientRepository.findAll().forEach(System.out::println);
        };
    }

}
