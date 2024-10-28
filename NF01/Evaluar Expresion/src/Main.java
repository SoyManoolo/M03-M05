import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String exp = sc.next();

        int c = expresion(exp);
        System.out.println(c);
    }
    public static int expresion (String exp) {
        int indexOfSuma = exp.lastIndexOf('+');
        int indexOfMulti = exp.lastIndexOf('*');

        if (indexOfSuma == -1 && indexOfMulti == -1) return Integer.parseInt(exp);
        else if (indexOfSuma >= 0) {
            String left = exp.substring(0, indexOfSuma);
            String right = exp.substring(indexOfSuma+1);

            int numLeft = expresion(left);
            int numRight = expresion(right);
            return numLeft + numRight;
        }
        else {
            String left = exp.substring(0, indexOfMulti);
            String right = exp.substring(indexOfMulti+1);

            int numLeft = expresion(left);
            int numRight = expresion(right);
            return numLeft * numRight;
        }
    }
}
