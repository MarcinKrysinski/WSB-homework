package pl.krysinski.module_1.model.devices;

import pl.krysinski.module_1.model.creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
