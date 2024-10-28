import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] matriu = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu[i][j] = sc.next();
            }
        }

        String direccio = sc.next();

        if (direccio.equals("→")) {
            for (int j = 0; j < m; j++) {
                if (matriu [n] [j].equals("#")) {
                    System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un obstacle.");
                    break;
                }
                else if (matriu [n] [j].equals("&")) {
                    System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un enemic.");
                    break;
                }
            }
        }

    }
}