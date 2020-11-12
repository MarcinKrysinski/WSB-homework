package pl.krysinski;

import pl.krysinski.module_1.model.Animal;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        System.out.println(dog);
        System.out.println(cat);

        for (int i = 0; i < 3; i++) {
            cat.feed();
        }
        for (int i = 0; i < 11; i++) {
            cat.takeAWalk();
        }
        cat.feed();
    }

}
