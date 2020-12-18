package pl.krysinski.module_1.model.creatures;

public class FarmAnimal extends Animal implements Edible{
    Double weight;



    public FarmAnimal(String species, Double weight) {
        super(species);
        this.weight =weight;
    }

    @Override
    public boolean beEaten(String species) {
        return species.equals("Pig");
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

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
