package pl.krysinski.module_1.model.creatures;

public class Pet extends Animal{

    Double weight;

    public Pet(String species, Double weight) {
        super(species);
        this.weight = weight;
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
    }

    @Override
    public void feed() {
        System.out.println("Nakarm");
    }

    public Double getWeight() {
        return weight;
    }
}
