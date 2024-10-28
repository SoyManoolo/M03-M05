import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantBusE1 = scanner.nextInt();
        int quantBusE2 = scanner.nextInt();
        int pasBus = scanner.nextInt();

        System.out.println((quantBusE1+quantBusE2)*pasBus);
    }
}