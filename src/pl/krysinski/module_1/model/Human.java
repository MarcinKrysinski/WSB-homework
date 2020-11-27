package pl.krysinski.module_1.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {

    private String firstName;
    private String lastName;
    private String phone;
    private Animal pet;
    private Car car;
    private Double salary;
    Double priceCar = getCar().getPrice();
    Double oneTwelfthOfTheCarPrice = priceCar / 12;

    public Human(String firstName, String lastName, String phone, Animal pet, Car car, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Wypłata nie może być ujemna!! (całe szczescie;))");
        } else {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }

    }

    public void setCar(Car car) {
        if (priceCar > salary) {
            System.out.println("Nie stać Cie na to auto, lecz może uda sie na kredyt. Zobaczmy....");
            if (oneTwelfthOfTheCarPrice <= salary) {
                System.out.println("Masz auto, co prawda jeszcze nie jest Twoje bo na kredyt, ale zawsze coś.");
                this.car = car;
            } else if (oneTwelfthOfTheCarPrice > salary) {
                System.out.println("Niestety na kredyt odpada. Jedz zbierac Truskawki, zapisz się na studia czy cos.");
            }
        } else if (priceCar < salary) {
            System.out.println("Bogacz! Kupiłeś za gotówke auto!");
            this.car = car;
        }
    }

    public Car getCar() {
        return car;
    }

    public Double getSalary() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return salary;
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
