package com.manoriega.bikerent.service;

import com.manoriega.bikerent.dao.IBikeDao;
import com.manoriega.bikerent.model.Bike;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());


    @Autowired
    private IBikeDao bikeDao;

    public void Save(Bike bike) {
        try {
            bikeDao.save(bike);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

    }

    public Optional<Bike> getById(Long id) {
        return bikeDao.findById(id);
    }

    public List<Bike> getAll() {
        return bikeDao.findAll();
    }

    public Boolean delete(Bike bike) {
        if (bike != null) {
            bikeDao.delete(bike);
            return true;
        } else {
            return false;
        }
    }

    public Bike update(Bike bike) {
        bikeDao.save(bike);
        return bike;
    }

}
