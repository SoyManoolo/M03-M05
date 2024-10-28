import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float altCamio = sc.nextFloat();
        int quantPont = sc.nextInt();
        float [] altPont = new float[quantPont];

        for (int i = 0; i < quantPont; i++) {
            altPont [i] = sc.nextFloat();
        }

        for (int i = 0; i < quantPont; i++) {
            if (altCamio >= altPont[i]) {
                i++;
                System.out.println("xoca amb el pont " + i);
                break;
            }
        }
    }
}
