package CarRental;

public class Car {
    private String CarId;
    private String CarModel;
    private int CarYear;
    private String CarBrand;
    private String CarBodyType;

    public Car(String carId, String carModel, int carYear, String carBrand, String carBodyType) {
        this.CarId = carId;
        this.CarModel = carModel;
        this.CarYear = carYear;
        this.CarBrand = carBrand;
        this.CarBodyType = carBodyType;
    }

    public String getCarId() {
        return CarId;
    }

    public String getCarModel() {
        return CarModel;
    }

    public int getCarYear() {
        return CarYear;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public String getCarBodyType() {
        return CarBodyType;
    }
}
