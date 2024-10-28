import java.util.Locale;
import java.util.Scanner;

class Alumne {
    private String nom;
    private String cognom;
    private float nota;

    public String aprovat() {
        String resposta;
        if (nota >= 5.0f) {
            resposta = nom +" "+ cognom +": aprova";
        }
        else {
            resposta= nom +" " + cognom +": suspèn";
        }
        return resposta;
    }

    public Alumne(String nom, String cognom, float nota) {
        this.nom = nom;
        this.cognom = cognom;
        this.nota = nota;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i=0; i < n; i++) {
            String n1 = sc.next();
            String n2 = sc.next();
            float n3 = sc.nextFloat();
            Alumne al1 = new Alumne(n1, n2, n3);
            System.out.println(al1.aprovat());

        }
        sc.close();
    }
}