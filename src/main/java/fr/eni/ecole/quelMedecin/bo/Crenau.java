package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Crenau {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private LocalTime debutConsultation;
    private int duree;
    private MedecinGeneraliste medecin;



    public Crenau(LocalTime debutConsultation, int duree, MedecinGeneraliste medecin) {
        this.debutConsultation = debutConsultation;
        this.duree = duree;
        this.medecin = medecin;
        medecin.ajouterCreneau(this);
    }

    public MedecinGeneraliste getMedecin() {

        return medecin;
    }

    public void afficher(){
                System.out.printf("%s - %s (%d minutes)%n",
                        this.debutConsultation.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
                        this.debutConsultation.plusMinutes(this.duree).format(
                                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);

    }
}
