package pl.sda.carrental.carrental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sda.carrental.carrental.dto.CarDTO;
import pl.sda.carrental.carrental.service.CarService;

import java.util.List;

@Controller
public class CarSinglePageController {

    private CarService carService;

    public CarSinglePageController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car-single/{id}")
    public String getCarPage(Model model, @PathVariable Long id) {

        List<CarDTO> carDTOList = carService.getAllCars();
        model.addAttribute("cars", carDTOList);

        CarDTO selectedCar = carService.getCarById(id);
        model.addAttribute("selectedCar", selectedCar);

        return "car-single";
    }
}