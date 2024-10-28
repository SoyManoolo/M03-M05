public class Numeros {
    private int a;
    private int b;
    private int c;
    public boolean senar() {
        return (a%2 != 0 && b%2 == 0 && c%2 == 0) ||
                (a%2 == 0 && b%2 != 0 && c%2 == 0) ||
                (a%2 == 0 && b%2 == 0 && c%2 != 0);
    }

    public Numeros(float a, float b, float c) {
        this.a = (int) a;
        this.b = (int) b;
        this.c = (int) c;
    }
}
