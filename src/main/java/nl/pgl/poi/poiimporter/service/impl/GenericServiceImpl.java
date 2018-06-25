package nl.pgl.poi.poiimporter.service.impl;

import nl.pgl.poi.poiimporter.domain.RandomCity;
import nl.pgl.poi.poiimporter.domain.User;
import nl.pgl.poi.poiimporter.repository.RandomCityRepository;
import nl.pgl.poi.poiimporter.repository.UserRepository;
import nl.pgl.poi.poiimporter.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
