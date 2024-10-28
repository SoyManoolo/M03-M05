public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Erik Manuel", 1000.0f);
        System.out.println("Sou de " + p1.nom + ": " + p1.getSou() + "$");
    }
}