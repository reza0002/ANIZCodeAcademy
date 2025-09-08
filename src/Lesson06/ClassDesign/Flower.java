package Lesson06.ClassDesign;

// Flower.java
public class Flower {
    private String name;
    private String color;
    private double price;
    private int stock;
    private String originCountry;

    // Full constructor
    public Flower(String name, String color, double price, int stock, String originCountry) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.stock = stock;
        this.originCountry = originCountry;
    }

    // Constructor without origin
    public Flower(String name, String color, double price, int stock) {
        this(name, color, price, stock, "Unknown");
    }

    // Constructor with only name and color
    public Flower(String name, String color) {
        this(name, color, 0.0, 0, "Unknown");
    }

    // Default constructor
    public Flower() {
        this("Unknown", "Unknown", 0.0, 0, "Unknown");
    }

    // Getters
    public String getName() { return name; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public String getOriginCountry() { return originCountry; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }
    public void setStock(int stock) { this.stock = stock; }
    public void setOriginCountry(String originCountry) { this.originCountry = originCountry; }

    // toString method
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }

    // equals method (only checks name and color)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Flower flower = (Flower) obj;
        return name.equals(flower.name) && color.equals(flower.color);
    }
}
