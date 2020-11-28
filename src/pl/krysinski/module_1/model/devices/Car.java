package pl.krysinski.module_1.model.devices;

public class Car extends Device {
    
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
