package Lesson04.ScannerIntro;

public class Person {
    private String name;
    private int age;
    private double height;
    private boolean likesPizza;

    // Constructor
    public Person(String name, int age, double height, boolean likesPizza) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.likesPizza = likesPizza;
    }

    // Method to describe the person
    public String getDescription() {
        String pizzaAnswer = likesPizza ? "likes pizza" : "does not like pizza";
        return name + " is " + age + " years old, " +
                height + "m tall, and " + pizzaAnswer + ".";
    }
}
