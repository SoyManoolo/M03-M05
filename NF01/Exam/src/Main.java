import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.ENGLISH);

        String expresion = sc.next();

        float c = exp1(expresion);
        System.out.println(c);
    }
    public static float exp1(String expresion) {
        int indexDiv = expresion.lastIndexOf("/");
        int indexMult = expresion.indexOf("*");

        if (indexMult == -1 && indexDiv == -1) return Integer.parseInt(expresion);
        else if (indexDiv >= 0) {
            String izq = expresion.substring(0, indexDiv);
            String der = expresion.substring(indexDiv + 1);

            float numIzq = exp1(izq);
            float numDer = exp1(der);
            return numIzq / numDer;
        }
        else {
            String izq = expresion.substring(0, indexMult);
            String der = expresion.substring(indexMult + 1);

            float numIzq = exp1(izq);
            float numDer = exp1(der);
            return numIzq * numDer;
        }
    }
    private static float exp2 (String c) {
        return 0;
    }
}
