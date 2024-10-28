import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n < 2) System.out.println(n);
        else {
            int c = fib(n, 2, 0, 1);
            System.out.println(c);
        }
    }
    private static int fib(int n, int i, int a, int b) {
        if (n == i) return a + b;
        else return fib(n, i+1, b, a+b);
    }
}
