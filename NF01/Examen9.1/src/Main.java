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


        int c = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < c ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > n-1) suma += 0;
            else if (b > m-1) suma += 0;
            else suma += matriu [a] [b];

        }
        System.out.println(suma);
    }
}