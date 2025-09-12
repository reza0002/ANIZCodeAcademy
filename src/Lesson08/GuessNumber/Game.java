package Lesson08.GuessNumber;


import java.util.Random;

class Game {
    private final int secretNumber;
    private int attempts = 0;

    public Game(int maxNumber) {
        Random rnd = new Random();
        this.secretNumber = rnd.nextInt(maxNumber) + 1; // hemmeligt tal
    }


    public boolean checkGuess(int guess) {
        attempts++;
        if (guess == secretNumber) {
            System.out.println("Korrekt! 🎯 Du gættede tallet på " + attempts + " forsøg.");
            return true;
        } else if (guess < secretNumber) {
            System.out.println("For lavt! 🔽");
        } else {
            System.out.println("For højt! 🔼");
        }
        return false;
    }
}
