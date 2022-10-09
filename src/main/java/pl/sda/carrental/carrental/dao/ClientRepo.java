package pl.sda.carrental.carrental.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.sda.carrental.carrental.dao.entity.Client;

@Repository
public interface ClientRepo extends PagingAndSortingRepository<Client, Long> {

}