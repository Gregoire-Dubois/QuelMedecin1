package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.Patient;

import java.time.LocalDate;

public class TestPatient {

    public static void main(String[] args) {

        Patient lePatient = new Patient("vambuche", "Hillary", "09..",
                'm', 28706024, LocalDate.of(1988, 3, 5));
        lePatient.afficher();


    }

}


//    public Adresse(String mentionsComple, int numero, String complNumero, String rue, int cp, String ville) {

//         Adresse adress = new Adresse(2, "du moulin neuf", "2B rue Benji", 44800, "Saint Herlblain");