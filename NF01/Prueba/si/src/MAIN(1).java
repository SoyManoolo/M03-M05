import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float contadorAciertos = 0.0f;

        System.out.println("Responde las siguientes preguntas:");
        System.out.println("¿En qué año comenzó la segunda Guerra Mundial?");

        int respuesta1 = scanner.nextInt();

        if (respuesta1 == 1939) {
            System.out.println("Correcto");
            contadorAciertos++;
        }
        else {
            System.out.println("Incorrecto");
            contadorAciertos -= 0.33f;
        }

        System.out.println("¿Y en que año finalizó?");

        int respuesta2 = scanner.nextInt();

        if (respuesta2 == 1945) {
            System.out.println("Correcto");
            contadorAciertos++;
        }
        else {
            System.out.println("Incorrecto");
            contadorAciertos -= 0.33f;
        }

        System.out.println("Di si la siguiente afirmación es verdadera o falsa:");
        System.out.println("España fue el causante de la segunda Guerra Mundial.");

        String respuesta3 = scanner.next().toLowerCase();
        boolean esFalso = respuesta3.equals("falso");

        if (esFalso) {
            System.out.println("Correcto");
            contadorAciertos++;
        }
        else {
            System.out.println("Incorrecto");
            contadorAciertos -= 0.33f;
        }

        System.out.println("Nota: " + contadorAciertos / 3 * 10);

        if (contadorAciertos > 2) {
            System.out.println("¡Felicidades!");
        }
        else if (contadorAciertos == 2) {
            System.out.println("Muy bien, pero todavía puedes mejorar");
        }
        else if (contadorAciertos < 1) {
            System.out.println("Más suerte la próxima");
        }
        else if (contadorAciertos == 1) {
            System.out.println("Más suerte la próxima");
        }
    }
}
