import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n < 2) System.out.println(n);
        else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i < n; i++) {
                c = a+b;
                b = c;
                a = b;
            }
        }
    }
}
