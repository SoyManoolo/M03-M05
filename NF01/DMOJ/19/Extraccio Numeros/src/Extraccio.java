public class Extraccio {
    private String a;

    public Extraccio(String a) {
        this.a = a;
    }
    public int ex1(){
        return Character.getNumericValue(a.charAt(1));
    }
    public int ex2(){
        return Character.getNumericValue(a.charAt(3));
    }
    public int ex3(){
        return Character.getNumericValue(a.charAt(5));
    }
    public int ex4(){
        return Character.getNumericValue(a.charAt(7));
    }
    public int operacio() {
        return ex1() + ex2() + ex3() + ex4();
    }

}
