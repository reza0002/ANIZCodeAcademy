package Lesson08.GuessNumber;

import java.util.Scanner;

class Player {
    private final String name;
    private final Scanner scanner;

    public Player(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public int makeGuess() {
        System.out.print(name + ", skriv dit gæt: ");
        return scanner.nextInt();
        //Komment din retur statement ud og prøve den her:
        //return Integer.parseInt(scanner.nextLine().trim());
    }

    /*
    //Komment din makeGuess() methode ud og prøve den her:
    public int makeGuess() {
        System.out.print(name + ", skriv dit gæt: ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Ugyldigt input. Prøv igen: ");
            }
        }
    }

     */
}
