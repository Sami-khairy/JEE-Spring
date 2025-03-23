package ma.khairy.hospital.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class RendezVous {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    @Enumerated(EnumType.STRING)
    private StatusRDV status;

    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;


    public RendezVous(Long id, Date date, StatusRDV status, Patient patient, Medecin medecin) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.patient = patient;
        this.medecin = medecin;
    }

    public RendezVous() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusRDV getStatus() {
        return status;
    }

    public void setStatus(StatusRDV status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", date=" + date +
                ", status=" + status +
                ", patient=" + patient +
                ", medecin=" + medecin +
                '}';
    }
}
