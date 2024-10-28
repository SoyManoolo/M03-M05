import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matriu = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        boolean trobat = false; // Variable para controlar si se encuentra una columna con los mismos números

        for (int j = 0; j < m; j++) {
            int actual = matriu[0][j]; // Valor de la primera fila en la columna actual
            boolean iguals = true; // Variable para verificar si todos los elementos de la columna son iguales

            for (int i = 1; i < n; i++) {
                if (matriu[i][j] != actual) { // Si algún elemento de la columna no coincide con el primero
                    iguals = false; // Se marca que no son todos iguales
                    break; // Salir del bucle, ya no es necesario verificar más
                }
            }

            if (iguals) { // Si todos los elementos de la columna son iguales
                System.out.println("La columna " + j + " té tots els números iguals.");
                trobat = true; // Se ha encontrado una columna con números iguales
                break; // No necesitamos verificar más columnas
            }
        }

        if (!trobat) { // Si no se encontró ninguna columna con números iguales
            System.out.println("No hi ha cap columna amb els números iguals.");
        }
    }
}
