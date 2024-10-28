import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String [] llibres = new String[n];
        int [] quantLlibres = new int[n];

        for (int i = 0; i < n; i++) {
            llibres [i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            quantLlibres [i] = sc.nextInt();
        }

        int numeroMenor = quantLlibres [0];
        for ( int quantLlibre  : quantLlibres) {
            if (quantLlibre < numeroMenor) {
                numeroMenor = quantLlibre;
            }
        }
        System.out.println("el llistat de llibres que menys tenim són:");

        for (int i = 0; i < n; i++) {
            if(numeroMenor == quantLlibres[i]){
                System.out.println(llibres[i] + " " + quantLlibres[i]);
            }
        }
    }
}
