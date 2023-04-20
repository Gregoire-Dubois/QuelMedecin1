package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.Adresse;
import fr.eni.ecole.quelMedecin.bo.Crenau;
import fr.eni.ecole.quelMedecin.bo.MedecinGeneraliste;

import java.time.LocalTime;

public class TestCreneau {
//"Dubois", "Grégoire", "06060...", 30
    public static void main(String[] args) {
        System.out.println("__________________________ Créneaux ______________________________");

        Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800,
                "Saint Herblain");
        MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", 60, sh);

        Crenau c1 = new Crenau(LocalTime.of(9, 0), 15, melanie);

        c1.afficher();

        System.out.println("Médecin associé à ce créneau : Dr " + c1.getMedecin().getNom());
        System.out.println("------------------------------------------------------------------");
        new Crenau(LocalTime.of(9, 15), 15, melanie);
        new Crenau(LocalTime.of(9, 30), 15, melanie);
        new Crenau(LocalTime.of(9, 45), 15, melanie);
        new Crenau(LocalTime.of(10, 30), 15, melanie);
        new Crenau(LocalTime.of(10, 45), 15, melanie);
        new Crenau(LocalTime.of(11, 15), 15, melanie);
        new Crenau(LocalTime.of(11, 30), 15, melanie);
        new Crenau(LocalTime.of(11, 45), 15, melanie);
        melanie.afficher();
        System.out.println("------------------------------------------------------------------");
        new Crenau(LocalTime.of(14, 0), 30, melanie);
        new Crenau(LocalTime.of(14, 30), 30, melanie);
        new Crenau(LocalTime.of(15, 0), 30, melanie);
        new Crenau(LocalTime.of(15, 30), 30, melanie);
        new Crenau(LocalTime.of(16, 0), 30, melanie);
        new Crenau(LocalTime.of(16, 30), 30, melanie);
        melanie.afficher();
    }


}
