import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.ENGLISH);

      String [] a = sc.nextLine().split(" ");
      String [] b = sc.nextLine().split(" ");

      int n = sc.nextInt();

      char [] c1 = a[n].toCharArray();
      char [] c2 = b[n].toCharArray();

      if (c1[0] == c2[0]) {
          System.out.println("La paraula a la posició " +n +" comença per la mateixa lletra a les dues línies.");
      }
      else {
          System.out.println("La paraula a la posició " +n +" comença per lletres diferents a les dues línies.");
      }

      if (Arrays.equals(a, b)) {
          System.out.println("Totes les paraules són les mateixes.");
      }
      else {
          System.out.println("Les paraules no són les mateixes.");
      }
      sc.close();
    }
}
