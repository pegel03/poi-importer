package nl.pgl.poi.poiimporter.repository;

import nl.pgl.poi.poiimporter.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}