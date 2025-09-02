package Lesson04.ScannerIntro;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        test();
    }

    public static void test()
    {
        Scanner input = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // int input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // double input
        System.out.print("Enter your height in meters (Use a comma as the decimal separator): ");
        double height = input.nextDouble();

        // boolean input
        System.out.print("Do you like pizza? (true/false): ");
        boolean likesPizza = input.nextBoolean();

        // Create Person object
        Person person = new Person(name, age, height, likesPizza);

        // Print description
        System.out.println("\n--- Person Info ---");
        System.out.println(person.getDescription());

        input.close();
    }
}
