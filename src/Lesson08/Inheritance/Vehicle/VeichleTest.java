package Lesson08.Inheritance.Vehicle;


// Main klasse
public class VeichleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120, 5);
        Vehicle bike = new Bicycle("Mountainbike", 25, true);

        System.out.println(car);
        car.move();
        if (car instanceof Car) ((Car) car).honk(); // cast for Car-only method

        System.out.println();

        System.out.println(bike);
        bike.toString();
        bike.move();
        if (bike instanceof Bicycle) ((Bicycle) bike).ringBell();
    }
}
