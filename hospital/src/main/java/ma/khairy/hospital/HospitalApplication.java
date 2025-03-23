package ma.khairy.hospital;


import ma.khairy.hospital.entity.*;
import ma.khairy.hospital.repository.ConsultationRepo;
import ma.khairy.hospital.repository.MedecinRepo;
import ma.khairy.hospital.repository.PatientRepo;
import ma.khairy.hospital.repository.RendezVousRepo;
import ma.khairy.hospital.service.IHospitalService;
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
	CommandLineRunner start(IHospitalService iHospitalService, PatientRepo patientRepo, MedecinRepo medecinRepo, RendezVousRepo rendezVousRepo){
		return args -> {
			Stream.of("Sami","Saad","Alaa")
					.forEach(name -> {
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setMalade(false);
						patient.setDateNaissance(new Date());
						iHospitalService.savePatient(patient);
					});
			Stream.of("Hassan","Najat","Said")
					.forEach(name -> {
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5 ? "Cardio" : "Generaliste" );
						iHospitalService.saveMedecin(medecin);
					});

			Patient p = patientRepo.findById(1L).get();
			Medecin m = medecinRepo.findById(1L).get();

			RendezVous rdv = new RendezVous();
			rdv.setPatient(p);
			rdv.setMedecin(m);
			rdv.setDate(new Date());
			rdv.setStatus(StatusRDV.PENDING);
			iHospitalService.saveRDV(rdv);

			RendezVous rdv1 = rendezVousRepo.findById(1L).get();

			Consultation c = new Consultation();
			c.setDateConsultation(new Date());
			c.setRapport("raport");
			c.setRendezVous(rdv1);
			iHospitalService.saveConsultation(c);
		};



	}

}
