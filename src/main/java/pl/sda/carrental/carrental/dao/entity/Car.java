package pl.sda.carrental.carrental.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long CarId;
    private String CarModel;
    private int CarProductYear;
    private String CarBrand;
    private String CarBodyType;

    public Car() {
    }

    public Car(Long carId, String carModel, int carProductYear, String carBrand, String carBodyType) {
        CarId = carId;
        CarModel = carModel;
        CarProductYear = carProductYear;
        CarBrand = carBrand;
        CarBodyType = carBodyType;
    }

    public Long getCarId() {
        return CarId;
    }

    public void setCarId(Long carId) {
        CarId = carId;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public int getCarProductYear() {
        return CarProductYear;
    }

    public void setCarProductYear(int carProductYear) {
        CarProductYear = carProductYear;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarBodyType() {
        return CarBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        CarBodyType = carBodyType;
    }
}
