public class Alumne extends Persona{
    private float nota;

    public Alumne(String nom, float nota) {
        super(nom);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
