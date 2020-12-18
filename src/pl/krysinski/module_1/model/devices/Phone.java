package pl.krysinski.module_1.model.devices;

import pl.krysinski.module_1.model.creatures.Human;

public class Phone extends Device implements Saleable{
    
    private Double screenSize;
    private String androidOrIos;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, String androidOrIos) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.androidOrIos =androidOrIos;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone On");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getPhone() == null) {
            System.out.println("Nie ma telefonu na sprzedaż ;(");
            throw new Exception("Brak auta");
        }
        else if (buyer.getCash() < price) {
            System.out.println("Nie stac Cie ziomek");
            throw new Exception("Brak hajsu");
        } else {
            buyer.setCash(buyer.getCash()- price);
            seller.setCash(seller.getCash() + price);
            seller.setPhone(seller.getPhone());
            buyer.setPhone(null);
            System.out.println("Transakcja sfinalizowana!");

        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", androidOrIos='" + androidOrIos + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
