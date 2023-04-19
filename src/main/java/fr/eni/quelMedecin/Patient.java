package fr.eni.quelMedecin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Patient {

    private String nom="";
    private String prenom= "";
    private String numeroDeTelephone = "";
    private char sexe = ' ';
    private long numSecu;
    private LocalDate dateNaissance;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
    }

    /**
     * Affiche sur la console sous la forme :
     * NOM Prénom
     * Téléphone : XXXXXXXXXX
     * Sexe : Féminin ou Masculin
     * Numéro de Sécurité sociale XXXXXXXXXXXXXXX
     */

    public void afficher(){

        System.out.print("Le patient : " + this.nom + "\n" + this.prenom + "\n" + this.sexe + "\n" + this.numeroDeTelephone + "\n" + this.numSecu + "\n" + this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
    }

}
