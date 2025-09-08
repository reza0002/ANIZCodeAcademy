package Lesson06.ClassDesign;

// FlowerShop.java
public class FlowerShopVer1 {
    public static void main(String[] args) {
        // Using full constructor
        Flower rose = new Flower("Rose", "Red", 25, 50, "Netherlands");

        // Using constructor without origin
        Flower tulip = new Flower("Tulip", "Yellow", 15, 100);

        // Using constructor with only name + color
        Flower lily = new Flower("Lily", "White");

        // Using default constructor
        Flower unknown = new Flower();

        // Set values with setters
        unknown.setName("Orchid");
        unknown.setColor("Purple");
        unknown.setPrice(40);
        unknown.setStock(20);
        unknown.setOriginCountry("Thailand");

        // Display with getters + toString
        System.out.println(rose.toString());
        System.out.println(tulip.toString());
        System.out.println(lily.toString());
        System.out.println(unknown.toString());

        // Example: use getters
        System.out.println("Rose price: " + rose.getPrice() + " kr");
        System.out.println("Tulip stock: " + tulip.getStock());

        // Check equals method
        Flower roseCopy = new Flower("Rose", "Red", 30, 10, "France");
        System.out.println("rose equals roseCopy? " + rose.equals(roseCopy));
        System.out.println("rose equals tulip? " + rose.equals(tulip));
    }
}
