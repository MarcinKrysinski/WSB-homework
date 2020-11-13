package pl.krysinski.module_1.model;

public class Human {

    private String firstName;
    private String lastName;
    private String phone;
    private Animal pet;
    private Car car;

    public Human(String firstName, String lastName, String phone, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
