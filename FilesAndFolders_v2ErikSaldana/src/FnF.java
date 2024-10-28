import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class FnF {
    public void createFile(String folderPath, String fileName, ArrayList<String> content) throws IOException{
        //Ha de crear l'estructura de directoris de folderPath (per exemple: "dir1/dir2/dir3"). Pots assumir que no existeixen.
        //Després ha de crear el fitxer "fileName" dins la ruta proporcionada per "folderPath" amb el contingut de "content".
        //Cada element dins de "content" s'ha d'escriure a una nova línia dins el fitxer.

        File directorio = new File(folderPath);
        if (!directorio.exists()) directorio.mkdirs();

        File fichero = new File(directorio, fileName);
        FileWriter escribir = new FileWriter(fichero);

        for (String c: content) {
            escribir.write(c + "\n");
        }
        escribir.close();
    }

    public ArrayList<String> readFile(String relPath) throws IOException{
        //Ha de llegir el fitxer (path relatiu, l'arrel serà la ruta del projecte).
        //Cada línia del fitxer ocuparà una posició dins la col·lecció (ArrayList) a retornar.

        File file = new File(relPath);
        Scanner sc = new Scanner(file);
        ArrayList<String> content = new ArrayList<>();
        while(sc.hasNextLine()){
            content.add(sc.nextLine() + "\n");
        }
        sc.close();
        return content;
    }

    public void deleteFile(String relPath){
        //Ha d'esborrar el fitxer demanat

        File f = new File(relPath);
        if (f.exists()) f.delete();
    }

    public void deleteFolder(String relPath){
        //Ha d'esborrar el directori demanat (només l'últim directori, no pas tota la ruta).

        File f = new File(relPath);
        if (f.exists()) f.delete();
    }
}
