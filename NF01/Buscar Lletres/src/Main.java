import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String lletra = sc.nextLine();
        char c = lletra.charAt(0);

        String frase = sc.nextLine();
        char [] array = frase.toCharArray();

        int contador=0;

        for (int i = 0; i < array.length; i++) {
            if (c == array[i]) {
                contador++;
            }
        }
        System.out.println(contador);
        sc.close();
    }
}
