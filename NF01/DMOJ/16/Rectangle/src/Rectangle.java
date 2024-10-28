public class Rectangle {
    int cordenadaX1;
    int cordenadaY1;
    int cordenadaX2;
    int cordenadaY2;

    public Rectangle(int cordenadaX1, int cordenadaY1, int cordenadaX2, int cordenadaY2) {
        this.cordenadaX1 = cordenadaX1;
        this.cordenadaY1 = cordenadaY1;
        this.cordenadaX2 = cordenadaX2;
        this.cordenadaY2 = cordenadaY2;
    }

    public int perimetre(){
        return Math.abs((cordenadaX1-cordenadaX2)+(cordenadaY1-cordenadaY2))*2;
    }
}
