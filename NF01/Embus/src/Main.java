import java.util.Scanner;

class Embus {
    private int quant_cotxes;
    private int minuts;

    public Embus(int quant_cotxes, int minuts) {
        this.quant_cotxes = quant_cotxes;
        this.minuts = minuts;
    }

    public float cotxes_min() {
        return (float) this.quant_cotxes / this.minuts;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int t = sc.nextInt();
        Embus e = new Embus(c, t);
        float r = e.cotxes_min();

        if (r <= 375) {
            System.out.println("No hi ha embús.");
        }
        else if (r > 375 && r <= 425) {
            System.out.println("Embús baix.");
        }
        else if (r > 425 && r <= 575) {
            System.out.println("Embús moderat.");
        }
        else if (r > 575 && r <= 625) {
            System.out.println("Embús alt.");
        }
        else if (r > 625) {
            System.out.println("Embús extrem.");
        }
    }
}
