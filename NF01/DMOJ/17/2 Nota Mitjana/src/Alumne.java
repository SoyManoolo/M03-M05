public class Alumne {
    private float nota1;
    private float nota2;
    private float nota3;

    public Alumne(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float media(){
        return (nota1+nota2+nota3)/3;
    }

}
