package fr.eni.quelMedecin;

import fr.eni.ecole.quelMedecin.bo.MedecinGeneraliste;

/**
 *
 * @author Grégoire Dubois
 * @version v1
 */


public class Main {
    public static void main(String[] args) {
        MedecinGeneraliste m = new MedecinGeneraliste("dub", "greg", "09", 23);
        m.afficher();

    }
}