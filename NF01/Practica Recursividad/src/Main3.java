import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        ArrayList <Integer> vector = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            else vector.add(n);
        }
        for (int i = 0; i < vector.size(); i++) {
            for (int j = i + 1; j < vector.size(); j++) {
                if (vector.get(i) > vector.get(j)) {
                    int temp = vector.get(i);
                    vector.set(i, vector.get(j));
                    vector.set(j, temp);
                }
            }
        }
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
    public static int ordenarVector(ArrayList <Integer> vector) {
        if (vector.size() <= 1) return 0;
        else {
            
        }
        return 0;
    }
}
