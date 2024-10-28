import java.util.Scanner;

class Llums {
    private boolean l1;
    private boolean l2;
    private boolean l3;

    public String llums_enceses() {
        String resposta = "";

        if (l1 == true && l2 == true && l3 == true) {
            resposta = "S'han encès totes les llums.";
        }
        else if (l1 == true && l2 == true && l3 == false) {
            resposta = "S'han encès dues llums.";
        }
        else if (l1 == true && l2 == false && l3 == false) {
            resposta = "Només hi ha un llum encès.";
        }
        else if (l1 == false && l2 == true && l3 == true) {
            resposta = "S'han encès dues llums.";
        }
        else if (l1 == false && l2 == false && l3 == true) {
            resposta = "Només hi ha un llum encès.";
        }
        else if (l1 == false && l2 == false && l3 == false) {
            resposta = "No s'ha encès cap llum.";
        }
        else if (l1 == false && l2 == true && l3 == false) {
            resposta = "Només hi ha un llum encès.";
        }
        else if (l1 == true && l2 == false && l3 == true) {
            resposta = "S'han encès dues llums.";
        }
        return resposta;
    }

    public Llums(boolean l1, boolean l2, boolean l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        Llums L = new Llums(a, b, c);

        System.out.println(L.llums_enceses());
        sc.close();
    }
}
