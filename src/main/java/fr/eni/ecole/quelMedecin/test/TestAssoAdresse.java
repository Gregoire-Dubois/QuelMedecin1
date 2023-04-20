package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.Adresse;
import fr.eni.ecole.quelMedecin.bo.MedecinGeneraliste;
import fr.eni.ecole.quelMedecin.bo.Patient;

import java.time.LocalDate;

public class TestAssoAdresse {

    public static void main(String[] args) {
        Adresse adressePatient2 = new Adresse(144, "", "144 rue jean jaures", 29200, "Brest");
        Patient lePatient2 = new Patient("VentDebout", "Margaux", "0606", 'f', 76543, LocalDate.of(1987, 2, 2),adressePatient2);

        lePatient2.afficher();


        Adresse adresseDocteur = new Adresse(228, "", "rue de Siam", 29200, "Brest");
        MedecinGeneraliste doc = new MedecinGeneraliste("Dubois", "Grégoire", "06060...", 30, adresseDocteur);

       doc.afficher();

    }

}
