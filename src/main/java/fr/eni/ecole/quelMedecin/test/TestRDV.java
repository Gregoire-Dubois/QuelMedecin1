package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestRDV {

    public static void main(String[] args) {

        Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
        MedecinGeneraliste melanie = new MedecinGeneraliste("War", "Greg", "02.28.03.17.28", 60,sh);
        new Crenau(LocalTime.of(9, 15), 15, melanie);
        new Crenau(LocalTime.of(9, 30), 15, melanie);
        new Crenau(LocalTime.of(9, 45), 15, melanie);
        new Crenau(LocalTime.of(10, 30), 15, melanie);
        new Crenau(LocalTime.of(10, 45), 15, melanie);
        new Crenau(LocalTime.of(11, 15), 15, melanie);
        new Crenau(LocalTime.of(11, 30), 15, melanie);
        Crenau c1 = new Crenau(LocalTime.of(11, 45), 15, melanie);
        new Crenau(LocalTime.of(14, 0), 30, melanie);
        new Crenau(LocalTime.of(14, 30), 30, melanie);
        new Crenau(LocalTime.of(15, 0), 30, melanie);
        new Crenau(LocalTime.of(15, 30), 30, melanie);
        new Crenau(LocalTime.of(16, 0), 30, melanie);
        new Crenau(LocalTime.of(16, 30), 30, melanie);
        System.out.println("__________________________ Rendez-Vous ___________________________");
        Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
        Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l, LocalDate.of(1992, 11, 21), nio);
        RendezVous rdv = new RendezVous(c1, adhemar, LocalDate.of(2020, 5, 23));
        rdv.afficher();


    }




}
