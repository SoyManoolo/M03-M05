import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        String[][] matriu = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = sc.next();
            }
        }

        int posicio1 = sc.nextInt();
        int posicio2 = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char[] paraula = matriu [i] [j].toCharArray();

                if (paraula.length > posicio2 && paraula.length > posicio1) {
                    for (int k = posicio1; k < posicio2; k++) {
                        System.out.print(paraula[k]);

                    }
                }
                else{
                    System.out.print("<ERROR>");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}