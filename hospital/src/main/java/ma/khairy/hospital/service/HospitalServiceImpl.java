package ma.khairy.hospital.service;

import ma.khairy.hospital.entity.Consultation;
import ma.khairy.hospital.entity.Medecin;
import ma.khairy.hospital.entity.Patient;
import ma.khairy.hospital.entity.RendezVous;
import ma.khairy.hospital.repository.ConsultationRepo;
import ma.khairy.hospital.repository.MedecinRepo;
import ma.khairy.hospital.repository.PatientRepo;
import ma.khairy.hospital.repository.RendezVousRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepo patientRepo;
    private MedecinRepo medecinRepo;
    private RendezVousRepo rendezVousRepo;
    private ConsultationRepo consultationRepo;

    public HospitalServiceImpl(PatientRepo patientRepo, MedecinRepo medecinRepo, RendezVousRepo rendezVousRepo, ConsultationRepo consultationRepo) {
        this.patientRepo = patientRepo;
        this.medecinRepo = medecinRepo;
        this.rendezVousRepo = rendezVousRepo;
        this.consultationRepo = consultationRepo;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepo.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }
}
