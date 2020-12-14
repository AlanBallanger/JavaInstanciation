package entities;
import entities.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    String adresse;

    public Personne (String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public void personnee (String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public String printName (String nom, String prenom) {
        return "Bonjour monsieur " + nom.toUpperCase() + " " + prenom;
    }

    public void modifyName (String nom) {
        this.nom = nom;
    }
    public void modifySubname (String prenom) {
        this.prenom = prenom;
    }
    public void modifyAddress (String adresse) {
        this.adresse = adresse;
    }
    public String getName () {
        return this.nom;
    }
    public String getSubname () {
        return this.prenom;
    }
    public String getAddress () {
        return this.adresse;
    }
}