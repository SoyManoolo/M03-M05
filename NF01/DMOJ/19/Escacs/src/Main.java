import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escacs escacs = new Escacs(scanner.nextInt(), scanner.nextInt());
        System.out.print(escacs.getP1());
        System.out.print(escacs.getP2());

    }
}
