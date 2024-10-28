import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matriu = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }
        int contador0 = 0;
        int contador1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriu [i] [j] == 1) {
                    contador1++;
                }
                else if (matriu [i] [j] == 0) {
                    contador0++;
                }
            }
        }
        System.out.println(contador0 +" " +contador1);
    }
}