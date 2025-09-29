package Lesson15.Abstract;

// Abstract base class
abstract class Computer {
    private String brand;
    private int ram;

    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    // Abstract method - SKAL implementeres i subklasser
    public abstract void bootUp();

    // toString() viser fælles info
    @Override
    public String toString() {
        return "Brand: " + brand + ", RAM: " + ram + "GB";
    }
}


