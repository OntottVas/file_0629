import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fealadat_1 {
    public static void main(String[] args) {
        System.out.println(StringFileImport.fileImport("peldaStrings.txt"));
    }
}

class StringFileImport {
    public static List<String> fileImport(String filePath) {
        File file = new File(filePath);
        List<String> fileImport = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                fileImport.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return fileImport;
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó statitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod peldaString.txt re és irasd ki az eredményt
