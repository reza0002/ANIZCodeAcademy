package Lesson04.WhileLoop;

public class BottleSong {
    private int bottles;

    public BottleSong(int bottles) {
        this.bottles = bottles;
    }

    public void sing() {
        while (bottles > 0) {
            System.out.println(bottles + " bottles of soda on the wall, " + bottles + " bottles of soda!");
            bottles--;
            System.out.println("Take one down, pass it around, " + bottles + " bottles of soda on the wall.\n");
        }
        System.out.println("No more bottles of soda on the wall! 🍾");
    }
}


