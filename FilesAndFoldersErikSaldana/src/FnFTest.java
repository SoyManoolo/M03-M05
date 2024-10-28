import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class FnFTest {

    @org.junit.jupiter.api.Test
    void createFile() {
        FnF fnf = new FnF();
        String carpeta = "folder";
        String fichero = "archivo";
        String contenido = "Hola buenas";
        File borrar = new File(carpeta + "/" + fichero);

        if(borrar.exists()){
            borrar.delete();
            fnf.createFile(carpeta, fichero, contenido);
        }
        else fnf.createFile(carpeta, fichero, contenido);

    }

    @org.junit.jupiter.api.Test
    void readFile() {
    }
}