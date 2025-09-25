package Lesson13.FileObjekt.Read;

public class FileHandlerTest {
    public static void main(String[] args) {
        String fileName = "testRead.txt";
        FileHandler fh = new FileHandler();
        // Opret fil i projektmappen
        fh.createFile(fileName);
        // Opret fil i en bestemt mappe (kræver at mappen eksisterer!)
        fh.createFile("C:/temp/myfile.txt");
        // Hvis du kører på Mac/Linux, kunne du skrive fx:
        // fh.createFile("/Users/ditnavn/Desktop/myfile.txt");

        //Skriv til fil
        fh.writeFile(fileName);

        // Read form fil  – husk at tilføje din egen filsti
        String fileContent = fh.readFileAsString(fileName);
        System.out.println("File content:\n" + fileContent);
    }
}
