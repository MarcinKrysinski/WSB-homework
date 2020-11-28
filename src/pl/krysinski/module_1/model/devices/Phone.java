package pl.krysinski.module_1.model.devices;

public class Phone extends Device{

    private Double screenSize;
    private String androidOrIos;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, String androidOrIos) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.androidOrIos =androidOrIos;
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
