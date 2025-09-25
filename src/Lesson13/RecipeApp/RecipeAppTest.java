package Lesson13.RecipeApp;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeAppTest {
    public static void main(String[] args) {
        recipeApp();
    }

    public static  void recipeApp()
    {
        Scanner input = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler("recipes.txt");

        // MANGLER - Opret fil, hvis ikke eksisterer


        // Spørg bruger om opskrift
        System.out.println("Skriv din yndlingsopskrift:");
        String recipeName = input.nextLine();

        Recipe recipe = new Recipe(recipeName);

        // MANGLER - Save recipe


        System.out.println("Opskriften er gemt!");

        // Læs alle opskrifter
        ArrayList<Recipe> recipes = fileHandler.readRecipes();
        System.out.println("\nAlle opskrifter i filen:");
        int count = 1;
        for (Recipe r : recipes) {
            System.out.println(count + ". " + r);
            count++;
        }

        input.close();
    }
}
