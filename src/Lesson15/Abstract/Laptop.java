package Lesson15.Abstract;

// Subclass: Laptop
class Laptop extends Computer {
    private int batteryLife;

    public Laptop(String brand, int ram, int batteryLife) {
        super(brand, ram);
        this.batteryLife = batteryLife;
    }

    @Override
    public void bootUp() {
        System.out.println(getBrand() + " Laptop is booting with battery life " + batteryLife + "h...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Laptop, Battery life: " + batteryLife + "h";
    }
}