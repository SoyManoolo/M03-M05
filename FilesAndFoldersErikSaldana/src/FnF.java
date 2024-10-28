import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class FnF {
    public void createFile(String folderPath, String fileName, String content){
        //Crear directorio
        File directorio = new File(folderPath);
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        //Crear fichero
        File fichero = new File(folderPath + "/" + fileName);
        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            }
            else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Escribir en fichero
        try {
            FileWriter escribirFichero = new FileWriter(folderPath + "/" + fileName);
            escribirFichero.write(content);
            escribirFichero.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Ha de crear el directori dins folderPath (path relatiu, l'arrel serà la ruta del projecte).
        //Després ha de crear el fitxer "fileName" dins del directori anterior amb el contingut "content".
    }

    public List<String> readFile(String relPath){
        //Ha de llegir el fitxer (path relatiu, l'arrel serà la ruta del projecte).

        try {
            File file = new File(relPath);
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        return new ArrayList<>();
    }
}
