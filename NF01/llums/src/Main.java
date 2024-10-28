import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int nHab = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nHab; i++) {
            boolean llum1 = sc.nextBoolean();
            boolean llum2 = sc.nextBoolean();
            boolean llum3 = sc.nextBoolean();
            sc.nextLine();

            if (llum1 && llum2 && llum3) {
                System.out.println("S'han encès totes les llums.");
            } else if (llum1 && llum2 && !llum3) {
                System.out.println("S'han encès dues llums.");
            } else if (llum1 && !llum2 && !llum3) {
                System.out.println("Només hi ha un llum encès.");
            } else if (!llum1 && llum2 && llum3) {
                System.out.println("S'han encès dues llums.");
            } else if (!llum1 && !llum2 && llum3) {
                System.out.println("S'han encès dues llums.");
            } else if (!llum1 && !llum2 && !llum3) {
                System.out.println("No s'ha encès cap llum.");
            } else if (!llum1 && llum2 && !llum3) {
                System.out.println("Només hi ha un llum encès.");
            } else if (llum1 && !llum2 && llum3) {
                System.out.println("S'han encès dues llums.");
            }
        }
    }
}
