import java.util.Locale;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        int c = SumaN(n);
        System.out.println(c);
    }
    public static int SumaN (int n) {
        if (n == 1) return 1;
        else return SumaN(n-1) + n;
    }
}
