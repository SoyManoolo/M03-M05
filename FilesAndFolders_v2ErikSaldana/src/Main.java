import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //Pots fer proves aqui per a comprobar con funciona la classe FnF, o també pots muntar proves unitàries ;)
        FnF f = new FnF();
        String folderPath = "dir1/dir2";
        String fileName = "file";
        String relpathfile = "dir1/dir2/file";
        ArrayList<String> content = new ArrayList<>(Arrays.asList("Linia 1", "Linia 2", "Linia 3"));
        f.deleteFile(relpathfile);
        f.deleteFolder(folderPath);
        f.createFile(folderPath, fileName, content);
        f.readFile(relpathfile);
    }
}
