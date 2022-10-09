package pl.sda.carrental.carrental.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.carrental.carrental.dao.entity.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepo extends CrudRepository<Reservation, Long> {

    List<Reservation> findByDate(Date date);
    List<Reservation> findAll();
}
