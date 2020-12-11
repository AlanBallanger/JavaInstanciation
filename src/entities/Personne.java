package entities;
import entities.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    String adresse;

    public Personne (String nom, String prenom, String addresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
}