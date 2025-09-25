package Lesson13.RecipeApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public void createFileIfNotExists() {
        //missing
    }

    public void saveRecipe(Recipe recipe) {
        //missing
    }

    public ArrayList<Recipe> readRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                recipes.add(new Recipe(line));
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return recipes;
    }
}
