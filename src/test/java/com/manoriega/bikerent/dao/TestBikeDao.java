package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Bike;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBikeDao {

    @Autowired
    private IBikeDao bikeDao;

    @Test
    public void contextLoads() {
        Bike bike1 = new Bike();
        bike1.setType("bike b");
        bikeDao.save(bike1);

        Bike bike2 = new Bike();
        bike2.setType("bike c");
        bikeDao.save(bike2);

        Bike bike3 = new Bike();
        bike3.setType("bike d");
        bikeDao.save(bike3);

        List<Bike> bikeList = bikeDao.findAll();
    }

}

