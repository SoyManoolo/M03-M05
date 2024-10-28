import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumne alumne = new Alumne(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println(alumne.media());
    }
}
