package pl.sda.carrental.carrental.service;

import org.springframework.stereotype.Service;
import pl.sda.carrental.carrental.dao.CarRepo;
import pl.sda.carrental.carrental.dao.entity.Car;
import pl.sda.carrental.carrental.dto.CarDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<CarDTO> getAllCars() {
        Iterable<Car> all = carRepo.findAll();
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : all) {
            CarDTO carDTO = new CarDTO();
            carDTO.setId(car.getCarId());
            //wypełnić reszte pól
            carDTOS.add(carDTO);
        }
        return carDTOS;
    }

    public CarDTO getCarById(Long id) {
        Car car = carRepo.findById(id).get();
        CarDTO carDTO = new CarDTO();
            carDTO.setId(car.getCarId());
            //wypełnić
        return carDTO;
    }

}
