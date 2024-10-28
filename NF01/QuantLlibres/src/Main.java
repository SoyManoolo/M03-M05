import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Qt = sc.nextInt();

        String[] Ti = new String[Qt];
        int[] Qc = new int[Qt];


        for(int i=0;i<Qt;i++){
            Ti[i] = sc.next();
        }
        for(int i=0;i<Qt;i++){
            Qc[i] = sc.nextInt();
        }

        System.out.println("el llistat de llibres que menys tenim són:");

        int min = Qc[0];
        for(int i=0;i<Qt;i++){
            if(Qc[i] < min){
                min = Qc[i];
            }
        }

        for(int i=0;i<Qt;i++){
            if(min == Qc[i]){
                System.out.println(Ti[i] + " " + Qc[i]);
            }
        }


    }
}