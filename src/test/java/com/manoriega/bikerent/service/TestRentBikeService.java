package com.manoriega.bikerent.service;


import com.manoriega.bikerent.dao.IBikeDao;
import com.manoriega.bikerent.dao.IPersonDao;
import com.manoriega.bikerent.dao.IPriceDao;
import com.manoriega.bikerent.model.Bike;
import com.manoriega.bikerent.model.BikeRent;
import com.manoriega.bikerent.model.Person;
import com.manoriega.bikerent.model.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRentBikeService {

    @Autowired
    private RentBikeService rentBikeService;

    @Autowired
    private IPriceDao priceDao;

    @Autowired
    private IPersonDao personDao;

    @Autowired
    private IBikeDao bikeDao;

    @Test
    public void testAssign() {

        Optional<Price> price = priceDao.findById(4L);
        Optional<Person> person = personDao.findById(1L);
        List<Bike> bikeList = bikeDao.findAll();
        BikeRent bikeRent = rentBikeService.assign(7, price.get(), person.get(), bikeList);
    }
}
