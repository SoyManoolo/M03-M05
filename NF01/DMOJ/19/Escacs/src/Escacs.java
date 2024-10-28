public class Escacs {
    private char p1;
    private int p2;

    public Escacs(int p1, int p2) {
        this.p1 = convertirNumeroALetra(p1);
        this.p2 = p2;
    }

    private static char convertirNumeroALetra(int numero) {
        return (char) ('a' + numero - 1);
    }

    public char getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }
}
