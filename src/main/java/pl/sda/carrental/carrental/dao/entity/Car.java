package pl.sda.carrental.carrental.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="car_id")
    private Long carId;
    @Column(name="car_model")
    private Long carModel;
    @Column(name="car_product_year")
    private int carProductYear;
    @Column(name="car_brand")
    private String carBrand;
    @Column(name="car_body_type")
    private String carBodyType;
    @Column(name="img")
    private String img;
    @Column(name="img2")
    private String img2;
    @Column(name="img3")
    private String img3;
    @Column(name="price")
    private String price;
    @Column(name="description")
    private String description;
    @Column(name="facilities")
    private String facilities;

    public Car() {
    }

    public Car(Long carId, String carModel, int carProductYear, String carBrand, String carBodyType,
               String img, String img2, String img3, String price, String description, String facilities) {
        this.carId = carId;
        this.carModel = Long.valueOf(carModel);
        this.carProductYear = carProductYear;
        this.carBrand = carBrand;
        this.carBodyType = carBodyType;
        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
        this.price = price;
        this.description = description;
        this.facilities = facilities;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCarModel() {
        return carModel;
    }

    public void setCarModel(Long carModel) {
        this.carModel = carModel;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }
}
