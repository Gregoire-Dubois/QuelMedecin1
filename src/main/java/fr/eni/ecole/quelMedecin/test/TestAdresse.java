package fr.eni.ecole.quelMedecin.test;

import fr.eni.quelMedecin.Adresse;

public class TestAdresse {

    public static void main(String[] args){
        Adresse adress = new Adresse(2, "du moulin neuf", "2B rue Benji", 44800, "Saint Herlblain" );

        adress.afficher();

    }
}
