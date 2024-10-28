import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Pacients p1 = new Pacients();
        p1.alcada = 173;
        p1.allergies = "no";
        p1.DNI = "57854721T";
        p1.cognom = "Gonzalez Fernandez";
        p1.nom = "Marcos";
        p1.data_naixement = new Date (100, 4,2);
        p1.genere = "home";
        System.out.println(p1.data_naixement);

    }
}