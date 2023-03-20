package pl.sda.carrental.carrental.service;

import org.springframework.stereotype.Service;
import pl.sda.carrental.carrental.dao.CarRepo;
import pl.sda.carrental.carrental.dao.entity.Car;
import pl.sda.carrental.carrental.dto.CarDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<CarDTO> getAllCars() {
        Iterable<Car> all = carRepo.findAll();
        List<CarDTO> carDTO = new ArrayList<>();
        for (Car car : all) {
            carDTO.add(mapCarToCarDTO(car));
        }
        return carDTO;
    }
public CarDTO getCarById(Long id) {
    Optional<Car> car = carRepo.findById(id);
    if (car.isPresent()) {
        return mapCarToCarDTO(car.get());
    }
    return null;
}

    private CarDTO mapCarToCarDTO(Car car) {
        CarDTO carDTO = new CarDTO();
        carDTO.setCarId(car.getCarId());
        carDTO.setImg(car.getImg());
        carDTO.setImg2(car.getImg2());
        carDTO.setImg3(car.getImg3());
        carDTO.setPrice(car.getPrice());
        carDTO.setCarYear(String.valueOf(car.getCarProductYear()));
        carDTO.setCarName(car.getCarBrand());
        carDTO.setDescription(car.getDescription());
        carDTO.setFacilities(car.getFacilities());
//      carDTO.setSummaryDTO(carDTO.getSummaryDTO());
        return carDTO;
    }

    }
