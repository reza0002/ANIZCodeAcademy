package Lesson08.Inheritance.Vehicle;

// Subklasse: Bicycle
class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String name, int speed, boolean hasBell) {
        super(name, speed);
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "Bicycle: " + name + ", speed: " + speed + " km/h, bell: " + (hasBell ? "Yes" : "No");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println(name + " rings: Ding Ding!");
        } else {
            System.out.println(name + " has no bell.");
        }
    }
}

