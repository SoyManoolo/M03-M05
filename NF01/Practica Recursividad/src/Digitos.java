import java.util.Locale;
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        System.out.println(dig(n));
    }
    public static int dig (int n) {
        if (n < 10) return 1;
        else return 1 + dig(n/10);
    }
}
