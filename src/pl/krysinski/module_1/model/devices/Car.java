package pl.krysinski.module_1.model.devices;

import pl.krysinski.module_1.model.creatures.Human;

public class Car extends Device implements Saleable{

    private Double price ;
    private Color color;

    public Car(String producer, String model, Integer yearOfProduction, Double price, Color color) {
        super(producer, model, yearOfProduction);
        this.price = price;
        this.color = color;
    }
    

    public Double getPrice() {
        return price;
    }

    @Override
    public void turnOn() {
        System.out.println("Vrooom");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCar() == null) {
            System.out.println("Nie ma auta na sprzedaż ;(");
            throw new Exception("Brak auta");
        }
        else if (buyer.getCash() < price) {
            System.out.println("Nie stac Cie ziomek");
            throw new Exception("Brak hajsu");
        } else {
            buyer.setCash(buyer.getCash()- price);
            seller.setCash(seller.getCash() + price);
            seller.setCar(seller.getCar());
            buyer.setCar(null);
            System.out.println("Transakcja sfinalizowana!");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color=" + color +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
