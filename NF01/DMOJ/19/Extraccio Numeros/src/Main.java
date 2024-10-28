import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Extraccio extraccio = new Extraccio(scanner.nextLine());
        System.out.println(extraccio.operacio());
    }
}
