package fr.eni.quelMedecin;


public class Adresse {

    private String mentionsComple = " ";
    private int numero;
    private String complNumero= " ";
    private String rue= " ";
    private int cp= 0;
    private String ville= " ";


    public Adresse(String mentionsComple, int numero, String complNumero, String rue, int cp, String ville) {
        this.mentionsComple = mentionsComple;
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }


      public Adresse( int numero, String complNumero , String rue, int cp, String ville) {
        this(null, numero, complNumero,rue, cp, ville);

    }

    public void afficher(){

        if (this.mentionsComple != null){        System.out.println(" l'adresse est : " + " " + this.numero  + " " + this.rue+ " " + this.complNumero + " " + this.mentionsComple + " " + this.cp+ " " + this.ville);
        }else {
            System.out.println(" l'adresse est : " + " " + this.numero  + " " + this.rue+ " " + this.complNumero + " " + this.cp+ " " + this.ville);
        }
    }
}
