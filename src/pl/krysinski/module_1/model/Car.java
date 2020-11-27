package pl.krysinski.module_1.model;

public class Car {

    private final String producer;
    private final String model;
    private final Double price = 75000.0;
    private Color color;

    public Car(String producer, String model, Color color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
