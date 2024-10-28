import java.util.Locale;
import java.util.Scanner;

public class Main2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n == 1) System.out.println(n);
        else numeros(n);
    }

    public static void numeros(int n) {
        if (n > 0) {
             numeros(n - 1);
            System.out.println(n);
        }
        else System.out.println();
    }
}