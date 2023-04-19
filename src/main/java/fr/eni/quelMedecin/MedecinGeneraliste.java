package fr.eni.quelMedecin;

public class MedecinGeneraliste {
    private String nom="";
    private String prenom = "";
    private String tel= "";
    private int tarif= 25;

    public MedecinGeneraliste(String nom, String prenom, String tel, int tarif) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.tarif = tarif;
    }

    // getter sur téléphone, tarif et nom

    public String getNumeroDeTelephone() {
        return tel;
    }

    public int getTarif() {
        return tarif;
    }

    public String getNom() {
        return nom;
    }

    // setter sur numéro de téléphone et tarif

    public void setNumeroDeTelephone(String tel) {
        this.tel = tel;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    /**
     * L'affichage en console resemblera à :
     *
     * _________________________ Médecin____________________________
     * Nom Prénom
     * Téléphone
     * prix de la consultation
     */

    public void afficher(){
        System.out.println("_________________________ Médecin____________________________");

        System.out.println(this.nom +" " +  this.prenom +"\n" + this.tel+"\n" + this.tarif + " euros");

    }
}
