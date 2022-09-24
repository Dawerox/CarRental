package CarRental;

import java.util.HashMap;

public class CarRental {

    private HashMap<String, Car> Cars = new HashMap<>();

    public void addCar(Car car){
        Cars.put(car.getCarId(), car);
    }



}
