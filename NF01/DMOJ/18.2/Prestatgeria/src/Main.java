import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prestatgeria prestatgeria = new Prestatgeria(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() );
        System.out.println(prestatgeria.capacitatLlibres());
    }
}
