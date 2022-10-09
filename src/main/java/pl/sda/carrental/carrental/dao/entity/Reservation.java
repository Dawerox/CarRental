package pl.sda.carrental.carrental.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "RESERVATION_ID")
    private long id;
    @Column(name = "CAR_ID")
    private long carId;
    @Column(name = "CLIENT_ID")
    private long clientId;
    @Column(name = "RES_DATE")
    private Date date;

    public Reservation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


