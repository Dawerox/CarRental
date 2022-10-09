package pl.sda.carrental.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.carrental.carrental.manager.CarReservation;
import pl.sda.carrental.carrental.service.CarReservationService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {

    @Autowired
    private CarReservationService carReservationService;

    @RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")

    public List<CarReservation> getAllReservationsForDate(@PathVariable(value="date")String dateString) {
        return this.carReservationService.getCarReservationsForDate(dateString);
    }
}