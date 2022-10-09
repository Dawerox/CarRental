package pl.sda.carrental.carrental.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="CARS")
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="CAR_ID")
    private Long carId;
    @Column(name="CAR_MODEL")
    private Long carModel;
    @Column(name="CAR_PRODUCT_YEAR")
    private int carProductYear;
    @Column(name="CAR_BRAND")
    private String carBrand;
    @Column(name="CAR_BODY_TYPE")
    private String carBodyType;

    public Car() {
    }

    public Car(Long carId, String carModel, int carProductYear, String carBrand, String carBodyType) {
        this.carId = carId;
        this.carModel = Long.valueOf(carModel);
        this.carProductYear = carProductYear;
        this.carBrand = carBrand;
        this.carBodyType = carBodyType;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public long getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = Long.valueOf(carModel);
    }

    public int getCarProductYear() {
        return carProductYear;
    }

    public void setCarProductYear(int carProductYear) {
        this.carProductYear = carProductYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }
}
