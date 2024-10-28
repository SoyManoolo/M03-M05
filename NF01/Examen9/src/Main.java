import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String expresion = sc.next();

        float c = exp(expresion);
        System.out.println(c);
    }

    public static float exp(String expresion) {
        int indexDiv = expresion.indexOf("/");
        int indexMulti = expresion.indexOf("*");
        int indexSuma = expresion.lastIndexOf('+');
        int indexResta = expresion.lastIndexOf("-");


        if (indexMulti == -1 && indexDiv == -1 && indexResta == -1 && indexSuma == -1) return Integer.parseInt(expresion);
        else if (indexSuma >= 0) {
            String izq = expresion.substring(0, indexSuma);
            String der = expresion.substring(indexSuma + 1);

            float numIzq = exp(izq);
            float numDer = exp(der);
            return numIzq + numDer;
        }
        else if (indexResta >= 0) {
            String izq = expresion.substring(0, indexResta);
            String der = expresion.substring(indexResta + 1);

            float numIzq = exp(izq);
            float numDer = exp(der);
            return numIzq - numDer;
        }
        else if (indexMulti >= 0){
            String izq = expresion.substring(0, indexMulti);
            String der = expresion.substring(indexMulti + 1);

            float numIzq = exp(izq);
            float numDer = exp(der);
            return numIzq * numDer;
        }
        else {
            String izq = expresion.substring(0, indexDiv);
            String der = expresion.substring(indexDiv + 1);

            float numIzq = exp(izq);
            float numDer = exp(der);
            return numIzq / numDer;
        }
    }
}
