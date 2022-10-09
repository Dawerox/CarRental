package pl.sda.carrental.carrental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.carrental.carrental.dto.CarDTO;

@Controller
public class PagesController {

    @GetMapping("/index")
    public String getMainPage(Model model) {
        return "index";
    }

    @GetMapping("/about")
    public String getAboutPage(Model model) {
        return "about";
    }

    @GetMapping("/agent-single")
    public String getagentsinglePage(Model model) {
        return "agent-single";
    }

    @GetMapping("/agents-grid")
    public String getagentsgirdPage(Model model) {
        return "agents-grid";
    }

    @GetMapping("/contact")
    public String getcontactPage(Model model) {
        return "contact";
    }

    @GetMapping("/cars-grid")
    public String getpropertygridPage(Model model) {
        return "cars-grid";
    }

    @GetMapping("/audi-a3")
    public String getAudiA3Page(Model model) {
        return "audi-a3";
    }
    @GetMapping("/bmw")
    public String getBmwPage(Model model) {
        return "bmw";
    }
    @GetMapping("/traffic")
    public String getTrafficPage(Model model) {
        return "traffic";
    }
    @GetMapping("/peugeot")
    public String getPeugeotPage(Model model) {
        return "peugeot";
    }
    @GetMapping("/mercedes")
    public String getMercedesPage(Model model) {
        return "mercedes";
    }
    @GetMapping("/skoda")
    public String getSkodaPage(Model model) {
        return "skoda";
    }

    @GetMapping("/car/{id}")
    public String getCarPage(Model model) {
        CarDTO carDTO = new CarDTO();
         carDTO.setId(1L);
         carDTO.setCarName("Audi1231231");
         carDTO.setCarYear("2016");
         carDTO.setDescription("Audi A3 8V to idealny pomost do samochodu kompaktowego segmentu premium." +
                 "Wygląda jak nowy model, szczególnie po liftingu, ma świetne wyposażenie," +
                 " a do tego zaskakuje jakością wykonania i nienaganną sylwetką.");
         carDTO.setPrice("$300 za dzień");
         carDTO.setSummary("xx");
         carDTO.setImg("audi-1.jpg");
         carDTO.setImg2("audi-2.jpg");
         carDTO.setImg3("audi-3.jpg");
         carDTO.setFacilities("Tempomat Klimatronic, 6-ścio biegowa skrzynia, Nawigacja, Podgrzewane fotele," +
                 " Ogrzewana szyba przednia, Podgrzewana kierownica, Elektryczne lusterka");

         model.addAttribute("carDTO", carDTO);

        return "car";
    }



}