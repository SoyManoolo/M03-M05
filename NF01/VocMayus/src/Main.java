import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String linea = sc.nextLine();

        while (!linea.equals("END")) {
            String lineaModificada = transformarVocales(linea);
            System.out.println(lineaModificada);

            linea = sc.nextLine();
        }
    }

    private static String transformarVocales(String cadena) {
        String resultado = "";
        for (char caracter : cadena.toCharArray()) {
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    resultado += Character.toUpperCase(caracter);
                    break;
                default:
                    resultado += caracter;
                    break;
            }
        }
        return resultado;
    }
}
