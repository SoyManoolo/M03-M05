public class Peix {
    private String especie;
    private String tipusAigua;
    private int quantitatPeixos;

    public String getEspecie() {
        return especie;
    }

    public String getTipusAigua() {
        return tipusAigua;
    }

    public int getQuantitatPeixos() {
        return quantitatPeixos;
    }

    public void setQuantitatPeixos(int quantitatPeixos) {
        this.quantitatPeixos = quantitatPeixos;
    }

    public void nadar() {
    }

    public boolean menjar(int quantitatMenjar) {
    return false;
    }
}