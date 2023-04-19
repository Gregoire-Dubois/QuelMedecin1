package fr.eni.ecole.quelMedecin.test;
import fr.eni.quelMedecin.MedecinGeneraliste;

public class TestMedecin {

    public static void main(String[] args){

        MedecinGeneraliste doc = new MedecinGeneraliste("Dubois", "Grégoire", "06060...", 30);

        doc.afficher();

        doc.setTarif(39);
        doc.afficher();

    }


}
