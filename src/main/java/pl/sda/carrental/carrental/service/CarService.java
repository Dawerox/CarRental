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
//        public List<CarDTO> getAllCars() {
//            Iterable<Car> all = carRepo.findAll();
//            List<CarDTO> carDTOS = new ArrayList<>();
//            for (Car car : all) {
//                CarDTO carDTO = new CarDTO();
//                carDTO.setId(car.getCarId());
//                carDTO.setImg(car.getImg());
//                carDTO.setImg2(car.getImg2());
//                carDTO.setImg3(car.getImg3());
//                carDTO.setPrice(car.getPrice());
//                carDTO.setCarYear(String.valueOf(car.getCarProductYear()));
//                carDTO.setCarName(car.getCarBrand());
//                carDTO.setDescription(car.getDescription());
//                carDTO.setFacilities(car.getFacilities());
//                carDTO.setSummaryDTO(carDTO.getSummaryDTO());
//                carDTOS.add(carDTO);
//            }
//            return carDTOS;
//        }
        return getCarDTOS(all);
    }

    public List<CarDTO> getCarById(Long id) {
        Iterable<Car> one = (Iterable<Car>) carRepo.findById(id).get();
        return getCarDTOS(one);
    }

    private List<CarDTO> getCarDTOS(Iterable<Car> one) {
        List <CarDTO> carDTOid = new ArrayList<>();
        for (Car car : one) {
            CarDTO carDTO = new CarDTO();
            carDTO.setId(car.getCarId());
            carDTO.setImg(car.getImg());
            carDTO.setImg2(car.getImg2());
            carDTO.setImg3(car.getImg3());
            carDTO.setPrice(car.getPrice());
            carDTO.setCarYear(String.valueOf(car.getCarProductYear()));
            carDTO.setCarName(car.getCarBrand());
            carDTO.setDescription(car.getDescription());
            carDTO.setFacilities(car.getFacilities());
            carDTO.setSummaryDTO(carDTO.getSummaryDTO());
            carDTOid.add(carDTO);
        }
        return carDTOid;
    }

}
