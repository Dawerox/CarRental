package pl.sda.carrental.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.carrental.carrental.service.CarReservationService;

@Controller
@RequestMapping("reservations")
public class ReservationController{
    @Autowired
    private CarReservationService carReservationService;

    @GetMapping("/reservations/{id}")
    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model) {

        model.addAttribute("carReservations",this.carReservationService.getCarReservationsForDate(dateString));
        return "reservations";
    }
}
