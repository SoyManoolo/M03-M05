class personal {
    public String DNI, Nom;
    public int telefon, idPersonal;
    public casa adjudicat;

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return Nom;
    }

    public int getTelefon() {
        return telefon;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public casa getAdjudicat() {
        return adjudicat;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setAdjudicat(casa adjudicat) {
        this.adjudicat = adjudicat;
    }
}

class casa {
    public String poble;
    public String nom;
    public int numero;
    public activitats actCasa;

    public String getPoble() {
        return poble;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public activitats getActCasa() {
        return actCasa;
    }
}

class activitats{
    int nivellQualitat, numAtribut;

    public int getNivellQualitat() {
        return nivellQualitat;
    }

    public int getNumAtribut() {
        return numAtribut;
    }
}

public class Main {
    public static void main(String [] args) {

        personal personal1 = new personal();
        personal1.DNI = "46479882X";
        personal1.Nom = "Erik Manuel Saldaña Diaz";
        personal1.idPersonal = 1234;
        personal1.telefon = 688297653;

        personal1.adjudicat = new casa();
        personal1.adjudicat.nom = "Aguacate";
        personal1.adjudicat.poble = "Torrassa";
        personal1.adjudicat.numero = 2;

        personal personal2 = new personal();
        personal2.Nom = "Fernando";
        personal2.DNI = "34429880B";
        personal2.telefon = 603329054;
        personal2.idPersonal = 12345;

        personal2.adjudicat = new casa();
        personal2.adjudicat.poble = "Santa Coloma";
        personal2.adjudicat.nom = "Puig Castellar";
        personal2.adjudicat.numero = 3;

        System.out.println(personal1.Nom);
        System.out.println(personal2.idPersonal);
    }
}
