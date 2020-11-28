package pl.krysinski;

import pl.krysinski.module_1.model.creatures.Animal;
import pl.krysinski.module_1.model.devices.Car;
import pl.krysinski.module_1.model.devices.Color;
import pl.krysinski.module_1.model.creatures.Human;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Car car = new Car("Ford", "Mustang",1960, 75000.0 , Color.Black);
        Human human = new Human("Marcin", "Krysiński", "777-777-777", dog, car, 70000.0);
//        System.out.println(human);
//        System.out.println(human.getSalary());
        human.setCar(car);
    }

}
