package Lesson08.Inheritance.Vehicle;

// Superklasse: Vehicle
class Vehicle {
    protected String name;
    protected int speed; // km/t

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Override toString for pæn output
    @Override
    public String toString() {
        return "Vehicle: " + name + ", speed: " + speed + " km/t";
    }

    public void move() {
        System.out.println(name + " is moving at " + speed + " km/h");
    }
}