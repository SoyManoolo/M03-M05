import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cordX1 = scanner.nextInt();
        int cordY1 = scanner.nextInt();
        int cordX2 = scanner.nextInt();
        int cordY2 = scanner.nextInt();
        Rectangle rectangle = new Rectangle(cordX1, cordY1, cordX2, cordY2);
        System.out.println(rectangle.perimetre());
    }
}
