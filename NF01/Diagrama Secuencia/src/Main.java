import java.util.Scanner;
class Multiplicacion{
    private float n1;
    private float n2;

    public Multiplicacion(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float mult(){
    return n1*n2;
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplicacion Mult = new Multiplicacion(scanner.nextFloat(), scanner.nextFloat());
        System.out.println(Mult.mult());
        scanner.close();
    }
}
