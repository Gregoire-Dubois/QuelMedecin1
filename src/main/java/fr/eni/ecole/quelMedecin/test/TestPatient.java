package fr.eni.ecole.quelMedecin.test;

import fr.eni.quelMedecin.Patient;

public class TestPatient {

    public static void main(String[] args) {

        Patient lePatient = new Patient("vambuche", "Hillary", "09..",
                'm', 28706024, 1988,02,01);
        lePatient.afficher();

    }

}
