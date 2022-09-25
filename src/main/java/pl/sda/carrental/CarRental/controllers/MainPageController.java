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

    @GetMapping("/blog-grid")
    public String getbloggrid(Model model) {
        return "blog-grid";
    }

    @GetMapping("/contact")
    public String getcontactPage(Model model) {
        return "contact";
    }

    @GetMapping("/property-grid")
    public String getpropertygridPage(Model model) {
        return "property-grid";
    }

    @GetMapping("/property-single")
    public String getpropertysinglePage(Model model) {
        return "property-single";
    }

    @GetMapping("/blog-single")
    public String getblogsinglePage(Model model) {
        return "blog-single";
    }

}