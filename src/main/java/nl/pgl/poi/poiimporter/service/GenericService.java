package nl.pgl.poi.poiimporter.service;

import nl.pgl.poi.poiimporter.domain.RandomCity;
import nl.pgl.poi.poiimporter.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}