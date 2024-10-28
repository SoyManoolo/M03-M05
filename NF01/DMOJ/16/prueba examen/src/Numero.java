public class Numero {
    private int a;
    private int b;
    private int c;
    public boolean parell_senar() {
        return (a%2 == 0 && b%2 == 0 && c%2 == 0) || (a%2 != 0 && b%2 != 0 && c%2 != 0);
    }

    public Numero(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
