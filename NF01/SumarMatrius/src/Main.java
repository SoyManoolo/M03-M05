import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] [] matriu = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu [i] [j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int j = 0; j < m; j++) {
                suma += matriu [i] [j];
            }
            System.out.println(suma);
        }
    }
}
