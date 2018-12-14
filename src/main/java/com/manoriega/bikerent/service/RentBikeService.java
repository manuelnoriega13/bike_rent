package com.manoriega.bikerent.service;

import com.manoriega.bikerent.dao.IBikeDao;
import com.manoriega.bikerent.dao.IBikeRentDao;
import com.manoriega.bikerent.dao.IPersonDao;
import com.manoriega.bikerent.dao.IPriceDao;
import com.manoriega.bikerent.model.Bike;
import com.manoriega.bikerent.model.BikeRent;
import com.manoriega.bikerent.model.Person;
import com.manoriega.bikerent.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RentBikeService {

    @Autowired
    private IBikeRentDao bikeRentDao;

    public BikeRent assign(Integer totalRent, Price price, Person person, List<Bike> bikeList) {
        BikeRent bikeRent = new BikeRent();
        bikeRent.setRented(new Date());
        bikeRent.setTotalRent(totalRent);
        bikeRent.setPrice(price);
        bikeRent.setPerson(person);
        bikeRent.setBikeList(bikeList);
        bikeRentDao.save(bikeRent);
        return bikeRent;
    }

}
