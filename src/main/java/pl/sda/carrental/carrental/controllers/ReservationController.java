package pl.sda.carrental.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.carrental.carrental.service.CarReservationService;

@Controller
@RequestMapping("reservations")
public class ReservationController{
    @Autowired
    private CarReservationService carReservationService;

    @GetMapping("/reservations")
    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model) {

        model.addAttribute("carReservations",this.carReservationService.getCarReservationsForDate(dateString));
        return "reservations";
    }
}
