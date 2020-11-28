package pl.krysinski.module_1.model.devices;

public class Phone extends Device{

    private String producer;
    private String model;
    private Integer yearOfProduction;
    private Double screenSize;
    private String androidOrIos;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, String androidOrIos) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.androidOrIos =androidOrIos;
    }
}
