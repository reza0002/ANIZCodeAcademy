package Lesson13.BufferedReader;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        String filnavn = "test.txt";

        // 1) Skriv til fil
        fh.writeToFile(filnavn, "Hej verden!\nDette er en test.");

        // 2) Læs fra fil
        String indhold = fh.readFromFile(filnavn);
        System.out.println("--- Indhold af filen ---");
        System.out.println(indhold);
    }
}
