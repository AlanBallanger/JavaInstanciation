package essais;
import entities.Personne;

public class TestPersonne {
    public static void main (String[] args) {
        Personne pers1 = new Personne("Jean", "Michel", "45 baker street");
        Personne pers2 = new Personne("Lou", "Boutin", "45 baker street");

        pers1.personnee("alan", "alan", "alan rue alan");
        System.out.println(pers1.printName("ballanger", "alan"));
        pers1.modifyName("la  babouche");
        pers1.modifySubname("alouch");
    }
}
