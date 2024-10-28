import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numeros numeros = new Numeros(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.print(numeros.senar());
    }
}
