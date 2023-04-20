package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {

    private Crenau crenau;
    private Patient patient;
    private LocalDate date;


    public RendezVous(Crenau crenau, Patient patient, LocalDate date) {
        this.crenau = crenau;
        this.patient = patient;
        this.date = date;
    }

    public void afficher(){

        System.out.printf("Rezndez-vous du %s", this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.crenau.afficher();
        System.out.printf("Avec le docteur %s%npour ", this.crenau.getMedecin().getNom());
        this.patient.afficher();

    }


}
