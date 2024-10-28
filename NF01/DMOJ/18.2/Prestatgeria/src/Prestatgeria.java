public class Prestatgeria {
    private int p;
    private int q;
    private int r;
    private int n;
    public boolean capacitatLlibres(){
        return (p * q * r) - n >= 0;
    }

    public Prestatgeria(int p, int q, int r, int n) {
        this.p = p;
        this.q = q;
        this.r = r;
        this.n = n;
    }
}
