package pl.krysinski;

import pl.krysinski.module_1.model.creatures.Animal;
import pl.krysinski.module_1.model.devices.Car;
import pl.krysinski.module_1.model.devices.Color;
import pl.krysinski.module_1.model.creatures.Human;
import pl.krysinski.module_1.model.devices.Phone;


public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog");
        Animal humanPet = new Animal("human");
        Phone phone = new Phone("Samsung", "Note10", 2020, 6.8, "android");
        Car car = new Car("Ford", "Mustang",1960, 75000.0 , Color.Black);
        Human human = new Human("Marcin", "Krysiński", "777-777-777", humanPet, car, 70000.0, 300.0);
        Human zenek = new Human("Zenek", "Mertyniuik", "777-777-777", null, car, 70000.0, 500.0);
//        System.out.println(human);
//        System.out.println(human.getSalary());
        human.setCar(car);
        System.out.println(phone);
        car.turnOn();
        phone.turnOn();

        System.out.println(human);
        System.out.println(zenek);
        dog.sell(human, zenek, 300.0);
        System.out.println(human);
        System.out.println(zenek);
    }

}
