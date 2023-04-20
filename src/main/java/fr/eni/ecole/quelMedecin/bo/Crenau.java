package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Crenau {

    private LocalTime debutConsultation;
    private int duree;
    private MedecinGeneraliste medecin;

    public Crenau(LocalTime debutConsultation, int duree, MedecinGeneraliste medecin) {
        this.debutConsultation = debutConsultation;
        this.duree = duree;
        this.medecin = medecin;
    }

    public MedecinGeneraliste getMedecin() {
        return medecin;
    }

    public void afficher(){
        System.out.print(this.debutConsultation);
    }
}
