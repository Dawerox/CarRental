package pl.sda.carrental.carrental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}