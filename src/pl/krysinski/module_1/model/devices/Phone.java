package pl.krysinski.module_1.model.devices;

public class Phone extends Device{

    private String producer;
    private String model;
    Integer yearOfProduction;
    private Double screenSize;
    private String androidOrIos;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
}
