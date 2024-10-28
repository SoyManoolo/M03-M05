import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int autobusE1 = scanner.nextInt();
        int autobusE2 = scanner.nextInt();
        int passatgers = scanner.nextInt();
        empresa e1 = new empresa(autobusE1, passatgers);
        empresa e2 = new empresa(autobusE2, passatgers);
        System.out.println(e1.seientsFlota() + e2.seientsFlota());
    }
}
