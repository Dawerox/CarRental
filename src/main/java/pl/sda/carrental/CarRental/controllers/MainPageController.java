package pl.sda.carrental.CarRental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/index")
    public String getMainPage(Model model) {
        return "index";
    }

}
