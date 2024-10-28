import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n < 2) System.out.println(n);
        else {
            int c = suma(n, 0);
            System.out.println(c);
        }
    }
    public static int suma (int n, int i) {
        if (n == i) return n;
        else return suma(n, i+ 1) + i;
    }
}
