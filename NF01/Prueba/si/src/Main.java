import java.util.Scanner;
import myUtils.Alumno;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();
        System.out.println("Inserte un numero");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }



    }
}
