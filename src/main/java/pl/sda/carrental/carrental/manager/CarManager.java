package pl.sda.carrental.carrental.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.carrental.carrental.dao.entity.Car;
import pl.sda.carrental.carrental.dao.CarRepo;

import java.util.Optional;

@Service
public class CarManager {

    private CarRepo carRepo;
@Autowired
    public CarManager(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Optional<Car> findById(Long id) {
        return carRepo.findById(id);
    }

    public Iterable<Car> findAll() {
        return carRepo.findAll();
    }
    public Car save(Car car) {
        return carRepo.save(car);
    }

    public void deleteById(Long id) {
        carRepo.deleteById(id);
    }

}
