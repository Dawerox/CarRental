package pl.sda.carrental.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.carrental.carrental.manager.CarReservation;
import pl.sda.carrental.carrental.dao.CarRepo;
import pl.sda.carrental.carrental.dao.ClientRepo;
import pl.sda.carrental.carrental.dao.ReservationRepo;
import pl.sda.carrental.carrental.dao.entity.Car;
import pl.sda.carrental.carrental.dao.entity.Client;
import pl.sda.carrental.carrental.dao.entity.Reservation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CarReservationService {
    private CarRepo carRepo;
    private ClientRepo clientRepo;
    private ReservationRepo reservationRepo;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public CarReservationService(CarRepo carRepo, ClientRepo clientRepo,
                                 ReservationRepo reservationRepo) {
        this.carRepo = carRepo;
        this.clientRepo = clientRepo;
        this.reservationRepo = reservationRepo;

    }

    public List<CarReservation> getCarReservationsForDate(String dateString) {
        Date date = createDateFromDateString(dateString);
        Map<Long, CarReservation> carReservationMap = new HashMap<>();

        Iterable<Car> cars = this.carRepo.findAll();
        cars.forEach(car -> {
            CarReservation carReservation = new CarReservation();
            carReservation.setCarId(car.getCarId());
            carReservation.setCarId(car.getCarModel());
            carReservation.setCarBrand(car.getCarBrand());
            carReservationMap.put(car.getCarId(), carReservation);
        });

        Iterable<Reservation> reservations = this.reservationRepo.findByDate(new java.sql.Date(date.getTime()));
        if (reservations != null) {

            reservations.forEach(reservation -> {
                Client client = this.clientRepo.findById(reservation.getClientId()).get();
                if (client != null) {
                    CarReservation carReservation = carReservationMap.get(reservation.getCarId());
                    carReservation.setClientId(client.getId());
                    carReservation.setFirstName(client.getFirstName());
                    carReservation.setLastName(client.getLastName());
                    carReservation.setDate(new java.sql.Date(date.getTime()));
                }
            });
        }

        List<CarReservation> carReservations = new ArrayList<>();
        for (Long carId : carReservationMap.keySet()) {
            carReservations.add(carReservationMap.get(carId));
        }
        return carReservations;
    }

    private Date createDateFromDateString(String dateString) {

        Date date = null;
        if (null != dateString) {
            try {
                date = DATE_FORMAT.parse(dateString);
            } catch (ParseException pe) {
                date = new Date();
            }
        } else {
            date = new Date();
        }

        return date;
    }
}
