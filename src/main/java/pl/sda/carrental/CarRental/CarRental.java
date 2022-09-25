package pl.sda.carrental.CarRental;

import java.util.HashMap;

public class CarRental {

    private HashMap<String, Car> Cars = new HashMap<>();

    public void addCar(Car car){
        Cars.put(car.getCarId(), car);
    }
    Car car = new Car("AudiA3","A3",2016,"Audi","Hatchback");
    Car car2 = new Car("BMWm3","m3",2015,"BMW","sedan");



}
