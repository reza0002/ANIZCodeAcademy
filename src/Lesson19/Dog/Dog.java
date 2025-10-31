package Lesson19.Dog;

import java.util.List;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDogYears() {
        return age * 7;
    }

    public static Dog findOldestDog(List<Dog> dogs) {
        if (dogs == null || dogs.isEmpty()) {
            return null;
        }

        Dog oldest = dogs.get(0);
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }
}
