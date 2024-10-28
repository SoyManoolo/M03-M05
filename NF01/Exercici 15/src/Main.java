import myUtils.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        float sum = c.suma(2.5f, 5.2f);
        System.out.println(sum);

        float rest = c.resta(2.5f, 5.2f);
        System.out.println(rest);

        float mult = c.multiplicacion(2.5f, 5.2f);
        System.out.println(mult);

        float div = c.division(2.5f, 5.2f);
        System.out.println(div);
    }
}