import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        numeros(n);

    }
    public static int numeros (int n) {
        System.out.println(n);
        if (n == 1) return 0;
        return numeros(n-1);
    }
}
