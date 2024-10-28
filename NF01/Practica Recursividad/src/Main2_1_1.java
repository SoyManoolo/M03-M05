import java.util.Locale;
import java.util.Scanner;

public class Main2_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        incre(n);
    }
    static void incre(int n) {
        if (n > 0) {
            incre(n - 1);
            System.out.print(n);
        } else
            System.out.println();
    }
}