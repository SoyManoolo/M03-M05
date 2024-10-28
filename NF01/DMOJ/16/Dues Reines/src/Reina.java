public class Reina {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Reina(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class amenaca {
    public boolean posibleAmenaca (Reina r1, Reina r2) {
        return r1.getX() == r2.getX() || r1.getY() == r2.getY()
    }
}