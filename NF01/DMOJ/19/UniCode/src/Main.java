import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UniCode uniCode = new UniCode(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.print(uniCode.getChA());
        System.out.print(uniCode.getChB());
        System.out.print(uniCode.getChC());
        System.out.print(uniCode.getChD());
        System.out.print(uniCode.getChE());
        System.out.println(uniCode.getChF());

        
    }
}
