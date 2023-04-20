package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
    public static final int MAX_CRENAUX = 15;
    private String nom = "";
    private String prenom = "";
    private String tel = "";
    private int tarif = 25;
    private Adresse adresse;

    private Crenau[] crenau = new Crenau[MAX_CRENAUX];

    public MedecinGeneraliste(String nom, String prenom, String tel, int tarif, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.tarif = tarif;
        this.adresse = adresse;

    }

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
     * <p>
     * _________________________ Médecin____________________________
     * Nom Prénom
     * Téléphone
     * prix de la consultation
     */

    public void afficher() {
        System.out.println("_________________________ Médecin____________________________");

        if (this.adresse == null){
            System.out.println(this.nom + " " + this.prenom + "\n" + this.tel + "\n"
                    + this.tarif + " euros" + "\n");
        }else {
            System.out.println(this.nom + " " + this.prenom + "\n" + this.tel + "\n"
                    + this.tarif + " euros" + "\n" + this.adresse);
        }

        System.out.println("Créneaux : ");
        for (int i = 0; i<this.crenau.length; i++){
            if(this.crenau[i] != null){
                this.crenau[i].afficher();
            }
        }

    }

    void ajouterCreneau(Crenau creneauAAjouter){

        if(this != creneauAAjouter.getMedecin()){
            System.err.println("Cecréanu ne peut être associé à ce médecin car il est déjà associé à un autre");
        }else {
            int pos = 0;
            while (pos< this.crenau.length && this.crenau[pos] != null){
                pos++;
                if(pos == this.crenau.length){
                    System.err.println("Trop de crénaux sont affectés à ce médecin");
                }else {
                    this.crenau[pos] = creneauAAjouter;
                }
            }
        }

    }


}
