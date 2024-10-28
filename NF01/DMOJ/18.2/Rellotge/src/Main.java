import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rellotge rellotge = new Rellotge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(rellotge.grausH());
        System.out.println(rellotge.grausM());
        System.out.println(rellotge.grausS());
    }
}
