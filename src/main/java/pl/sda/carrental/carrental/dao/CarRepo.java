package pl.sda.carrental.carrental.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.carrental.carrental.dao.entity.Car;

@Repository
public interface CarRepo extends CrudRepository<Car, Long> {
}
