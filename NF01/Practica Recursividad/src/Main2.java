import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        numeros(1);
    }
    public static int numeros (int n) {
        System.out.println(n);
        if (n == 5) return 0;
        return numeros(n+1);
    }
}
