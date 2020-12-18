package pl.krysinski.module_1.model.creatures;

import pl.krysinski.module_1.model.devices.Saleable;

public abstract class Animal implements Saleable, Feedable {

    private final String species;
    private Double weight;
    private String name;

    public Animal(String species, Double weight) {
        this.species = species;

        if (species.equals("dog")) {
            this.weight = 10.0;

        } else if (species.equals("cat")) {
            this.weight = 7.0;
        }
    }

    public Animal(String species) {
        this.species = species;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getPet().species.equals("human")){
            System.out.println("Nie handluje się ludzmi!");
            throw new Exception("Handel człowiekiem");
        }
        if (seller.getPet() == null) {
            System.out.println("Nie ma zwierzaka na sprzedaz ;(");
            throw new Exception("Brak zwierzaka");
        } else if (buyer.getCash() < price) {
            System.out.println("Nie stac Cie ziomek");
            throw new Exception("Brak hajsu");
        } else {
            buyer.setCash(buyer.getCash()- price);
            seller.setCash(seller.getCash() + price);
            seller.setPet(seller.getPet());
            buyer.setPet(null);
            System.out.println("Transakcja sfinalizowana!");

        }

    }
}
