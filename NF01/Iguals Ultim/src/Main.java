import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int [] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == num[n-1]) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
