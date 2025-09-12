package Lesson08.Inheritance.Vehicle;


// Subklasse: Car
class Car extends Vehicle {
    private int seats;

    public Car(String name, int speed, int seats) {
        super(name, speed);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car: " + name + ", speed: " + speed + " km/h, seats: " + seats;
    }

    public void honk() {
        System.out.println(name + " says: Beep Beep!");
    }
}

