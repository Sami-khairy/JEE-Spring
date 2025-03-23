package ma.khairy.hospital.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;


    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;


    public Patient(Long id, String nom, Date dateNaissance, boolean malade) {
        this.id = id;
        Nom = nom;
        this.dateNaissance = dateNaissance;
        this.malade = malade;
    }

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isMalade() {
        return malade;
    }

    public void setMalade(boolean malade) {
        this.malade = malade;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", malade=" + malade +
                ", rendezVous=" + rendezVous +
                '}';
    }
}
