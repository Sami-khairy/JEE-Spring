package ma.khairy.hospital.service;

import ma.khairy.hospital.entity.Consultation;
import ma.khairy.hospital.entity.Medecin;
import ma.khairy.hospital.entity.Patient;
import ma.khairy.hospital.entity.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
