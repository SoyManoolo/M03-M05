import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clau = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();


        while (true) {
            int num = sc.nextInt();
            if (num == -1)
                break;
            else
                array.add(num);

        }

        for (int i = 0; i < array.size()-2 ; i++) {
            int actual = array.get(i);
            int suma = array.get(i+1);
            int mult = array.get(i+2);

            if ((actual + suma)* mult == clau) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
