import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p = sc.next();
        char [] p1 = p.toCharArray();

        int suma = 0;
        for (int i = 1; i < p1.length; i+= 2) {
            int numero = Character.getNumericValue(p1[i]);
            suma += numero;
        }
        System.out.println(suma);
    }
}
