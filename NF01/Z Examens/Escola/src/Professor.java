public class Professor extends Persona{
    private float sou;

    public Professor(String nom, float sou) {
        super(nom);
        this.sou = sou;
    }

    private Alumne alumne;

    public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }
    public void avaluar() {

    }
}
