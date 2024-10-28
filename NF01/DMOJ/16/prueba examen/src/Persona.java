public class Persona {
    public String presentarse(){
        return "Hola, soc una persona";
    }
}
class Alumne extends Persona{
    public String presentarse(){
        return super.presentarse() + ", pero també soc un alumne";
    }
}

