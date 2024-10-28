import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        String[] palabras = sc.nextLine().split(" ");

        int longitud = sc.nextInt();

        String palabraMasLarga = encontrarPalabraMasLarga(palabras);
        String palabraMasCorta = encontrarPalabraMasCorta(palabras);
        String palabraDeLongitud = encontrarPalabraDeLongitud(palabras, longitud);

        System.out.printf("La paraula més llarga és: " +palabraMasLarga + " (" + palabraMasLarga.length() +" lletres).\n");
        System.out.printf("La paraula més curta és: " +palabraMasCorta +" (" +palabraMasCorta.length() +" lletres).\n");

        if (palabraDeLongitud != null) {
            System.out.printf("La paraula de longitud " +longitud +" que s'ha trobat és: " +palabraDeLongitud +"\n");
        } else {
            System.out.printf("No s'ha trobat cap paraula de longitud " +longitud +".\n");
        }
    }

    public static String encontrarPalabraMasLarga(String[] palabras) {
        String masLarga = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }
        return masLarga;
    }

    public static String encontrarPalabraMasCorta(String[] palabras) {
        String masCorta = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() < masCorta.length()) {
                masCorta = palabra;
            }
        }
        return masCorta;
    }

    public static String encontrarPalabraDeLongitud(String[] palabras, int longitud) {
        String palabraDeLongitud = null;
        for (int i = palabras.length - 1; i >= 0; i--) {
            if (palabras[i].length() == longitud) {
                palabraDeLongitud = palabras[i];
                break;
            }
        }
        return palabraDeLongitud;
    }
}
