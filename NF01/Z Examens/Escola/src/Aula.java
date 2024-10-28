public class Aula {
private String nom;
private String grup;

    public Aula(String grup, String nom) {
        this.grup = grup;
        this.nom = nom;
    }

    private Persona[] persona;

    public String getNom() {
        return nom;
    }

    public String getGrup() {
        return grup;
    }
}
