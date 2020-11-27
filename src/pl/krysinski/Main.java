package pl.krysinski;

import pl.krysinski.module_1.model.Animal;
import pl.krysinski.module_1.model.Car;
import pl.krysinski.module_1.model.Color;
import pl.krysinski.module_1.model.Human;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Car car = new Car("Ford", "Mustang", Color.Black);
        Human human = new Human("Marcin", "Krysiński", "777-777-777", dog, car, 70000.0);
//        System.out.println(human);
//        System.out.println(human.getSalary());
        human.setCar(car);
    }

}
