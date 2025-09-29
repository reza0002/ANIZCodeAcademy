package Lesson15.Abstract;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        computers.add(new Laptop("Dell", 16, 8));
        computers.add(new Desktop("Alienware", 32, true));
        computers.add(new Laptop("MacBook", 8, 12));

        // Print og boot alle computere
        for (Computer c : computers) {
            System.out.println(c); // toString() kaldes automatisk
            c.bootUp();
            System.out.println();
        }
    }
}
