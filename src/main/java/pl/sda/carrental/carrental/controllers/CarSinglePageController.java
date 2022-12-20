package pl.sda.carrental.carrental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sda.carrental.carrental.dto.CarDTO;
import pl.sda.carrental.carrental.dto.SummaryDTO;
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

        List<CarDTO> carDTOS = carService.getCarById(id);


//        SummaryDTO summaryDTO = new SummaryDTO();
//        System.out.println(id);
////
//        CarDTO carDTO = new CarDTO();
//        carDTO.setId(1L);
//        carDTO.setCarName("Audi A3 8V");
//        carDTO.setCarYear("2016");
//        carDTO.setDescription("Audi A3 8V to idealny pomost do samochodu kompaktowego segmentu premium." +
//                "Wygląda jak nowy model, szczególnie po liftingu, ma świetne wyposażenie," +
//                " a do tego zaskakuje jakością wykonania i nienaganną sylwetką.");
//        carDTO.setPrice("$300 za dzień");
//        carDTO.setSummaryDTO(summaryDTO);
//        carDTO.setImg("audi-1.jpg");
//        carDTO.setImg2("audi-2.jpg");
//        carDTO.setImg3("audi-3.jpg");
//        carDTO.setFacilities("Tempomat Klimatronic, 6-ścio biegowa skrzynia, Nawigacja, Podgrzewane fotele," +
//                " Ogrzewana szyba przednia, Podgrzewana kierownica, Elektryczne lusterka");


        model.addAttribute("carDTO", carDTOS);

        return "car-single";
    }

}
