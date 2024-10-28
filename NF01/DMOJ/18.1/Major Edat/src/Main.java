import java.util.Scanner;

class Persona{
    private int edat;

    public int getEdat() {
        return edat;
    }

    public Persona(int edat) {
        this.edat = edat;
    }
    public boolean mEdat(){
        return edat >=18;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edat1 = scanner.nextInt();
        Persona persona = new Persona(edat1);
        System.out.println(persona.mEdat());
    }
}
