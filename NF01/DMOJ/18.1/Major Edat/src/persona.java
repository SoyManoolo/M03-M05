import java.util.Scanner;

public class persona {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int edat = scanner.nextInt();
                boolean majorEdat = edat >= 18;
                System.out.println(majorEdat);
        }
}