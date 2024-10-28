import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n < 3) System.out.println(n);
        else {
            int c = factorial(n);
            System.out.println(c);
        }
    }
    private static int factorial (int n) {
        if (n < 2) return 1;
        else return factorial(n-1) * n;
    }
}
