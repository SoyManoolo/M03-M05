public class Rellotge {
    private int h;
    private int m;
    private int s;

    public Rellotge(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public float grausH() {
        return (h * 30) + (m * 0.5f) + (s * 0.00833f);
    }
    public float grausM() {
        return (m * 6) + (s * 0.1f);
    }
    public float grausS() {
        return s * 6;
    }
}
