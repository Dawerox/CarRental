package pl.sda.carrental.carrental.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.carrental.carrental.dao.entity.Car;
import pl.sda.carrental.carrental.manager.CarManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/car")
public class CarApi {

    private CarManager cars;
@Autowired
    public CarApi(CarManager cars) {
        this.cars = cars;
    }

    @GetMapping("/all")
    public Iterable<Car> getAll(){
    return cars.findAll();
    }

    @GetMapping("/find")
    public Optional<Car> getById(@RequestParam Long index){
        return cars.findById(index);
    }

    @PostMapping("/add")
    public Car addCar(@RequestBody Car car){
        return cars.save(car);
    }
    @PutMapping("/update")
    public Car updateCar(@RequestBody Car car){
        return cars.save(car);
    }
    @DeleteMapping("/delete")
    public void deleteCar(@RequestParam Long index){
    cars.deleteById(index);
    }
}

