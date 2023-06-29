import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feladat_2 {
    public static void main(String[] args) {
      List<String> lines = FileImport.fileImport("szamok.txt");
      int sum = 0;
      for (var actual : lines) {
          for (var actualNumber : actual.split(" ")){
              sum += Integer.parseInt(actualNumber);
          }
      }
        System.out.println("Sum of numbers: " + sum);
    }
}

class FileImport {
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

// Írj egy osztályt mely tartalmaz egy fájlból olvasó satitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod szamok.txt re és irasd ki az eredményt
// az eredményed számokat tartalmaz szóközökkel elválasztva írasd ki a számok összegét
