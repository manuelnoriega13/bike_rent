package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.dto.Promo;
import com.manoriega.bikerent.model.Bike;
import com.manoriega.bikerent.model.BikeRent;
import com.manoriega.bikerent.model.Person;
import com.manoriega.bikerent.model.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDaoBikeRent {

    @Autowired
    private IBikeRentDao bikeRentDao;

    @Autowired
    private IBikeDao bikeDao;

    @Autowired
    private IPriceDao priceDao;

    @Autowired
    private IPersonDao personDao;

    @Test
    public void testSaveBikeRent() {
        List<Bike> bikeList = bikeDao.findAll();

        Optional<Price> price = priceDao.findById(4L);
        Optional<Person> person = personDao.findById(1L);
        BikeRent bikeRent = new BikeRent();
        bikeRent.setPerson(person.get());
        bikeRent.setPrice(price.get());
        bikeRent.setBikeList(bikeList);
        bikeRent.setTotalRent(1);
        bikeRent.setRented(new Date());
        bikeRentDao.save(bikeRent);

    }

}
