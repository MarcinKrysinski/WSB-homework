package pl.krysinski.module_1.model.creatures;

public class Animal {

    private final String species;
    private Double weight;
    private String name;

    public Animal(String species) {
        this.species = species;

        if (species.equals("dog")) {
            this.weight = 10.0;

        } else if (species.equals("cat")) {
            this.weight = 7.0;
        }
    }

    public void feed() {
        if (weight != 0) {
            weight += 1;
            System.out.println("Nakarmiłeś pupila. Waga zwierzaczka: " + weight);
        } else {
            System.out.println("Co Ty chcesz nakarmić jak ON nie żyje!!! Nie dociera?!?!?!");
        }
    }

    public void takeAWalk() {
        if (weight > 1) {
            weight -= 1;
            System.out.println("Wyprowadziłeś pupila. Waga zwierzaczka: " + weight);
        } else if (weight == 1) {
            weight -= 1;
            System.out.println("Wyprowadziłeś pupila ostani raz, bo Twój pupil własnie zdechł. Waga truchła: " + weight);
        } else {
            System.out.println("Chcesz wyprowadzić zwłoki?!? On nie żyje!!! Nie dociera?!?!?!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
