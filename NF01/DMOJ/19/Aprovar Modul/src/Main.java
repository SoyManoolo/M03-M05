import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UF1 uf1 = new UF1(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        UF2 uf2 = new UF2(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        UF3 uf3 = new UF3(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(uf1.aprovat());
        System.out.println(uf2.aprovat());
        System.out.println(uf3.aprovat());
        Alumne alumne = new Alumne(uf1, uf2, uf3);
        System.out.println(alumne.mAprovat());
    }
}