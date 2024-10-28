import java.util.Scanner;
import java.util.Locale;

 class Calculadora {
    private float acumulador;

    public Calculadora() {
        this.acumulador = 0.0f;
    }

    public float getAcumulador() {
        return acumulador;
    }

    public void realizarOperacion(String operador, float numero) {
        switch (operador) {
            case "+":
                acumulador += numero;
                System.out.println(acumulador);
                break;
            case "-":
                acumulador -= numero;
                System.out.println(acumulador);
                break;
            case "*":
                acumulador *= numero;
                System.out.println(acumulador);
                break;
            case "/":
                acumulador /= numero;
                System.out.println(acumulador);
                break;
            case "END":
                System.out.println("0.0");
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        sc.useLocale(Locale.ENGLISH);

        while (true) {
            String operador = sc.next();
            float numero = sc.nextFloat();
            calculadora.realizarOperacion(operador, numero);
        }
    }
}