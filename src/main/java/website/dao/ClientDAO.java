package website.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import website.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Integer> {

}
