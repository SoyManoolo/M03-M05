import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Num mum = new Num(scanner.nextFloat(), scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
        System.out.print(mum.getA() + " ");
        System.out.print(mum.getB() + " ");
        System.out.print(mum.getC() + " ");
        System.out.print(mum.getD() + " ");
    }
}
