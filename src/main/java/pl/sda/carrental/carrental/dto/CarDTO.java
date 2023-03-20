package pl.sda.carrental.carrental.dto;

public class CarDTO {

    private Long id;
    private String carYear;
    private String img;
    private String img2;
    private String img3;
    private String carName;
    private String price;
    private String description;

    private String facilities;

    private SummaryDTO summaryDTO;

    public SummaryDTO getSummaryDTO() {
        return summaryDTO;
    }

    public void setSummaryDTO(SummaryDTO summaryDTO) {
        this.summaryDTO = summaryDTO;
    }

    public Long getCarId() {
        return id;
    }

    public void setCarId(Long id) {
        this.id = id;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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

