package entities;

public class AdressePostale {
    int num;
    String addr;
    int code;
    String ville;
    public AdressePostale (int num, String addr, int code, String ville) {
        this.num = num;
        this.addr = addr;
        this.code = code;
        this.ville = ville;
    }
}