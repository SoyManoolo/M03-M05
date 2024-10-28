import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int quant_nens = sc.nextInt();
        float [] altura = new float[quant_nens];

        for (int i=0; i< quant_nens; i++) {
            altura[i] = sc.nextFloat();
        }

        float altura_atraccio = sc.nextFloat();

        for (int i=0; i< quant_nens; i++) {
            if (altura[i] >= altura_atraccio) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
