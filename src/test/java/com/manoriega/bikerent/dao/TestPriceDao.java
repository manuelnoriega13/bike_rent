package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPriceDao {

    @Autowired
    private IPriceDao priceDao;

    @Test
    public void testSavePrice(){
        Price priceHour = new Price();
        priceHour.setDescription("hour");
        priceHour.setValue(5);
        priceDao.save(priceHour);

        Price priceDay = new Price();
        priceDay.setDescription("day");
        priceDay.setValue(20);
        priceDao.save(priceDay);

        Price priceWeek = new Price();
        priceWeek.setDescription("week");
        priceWeek.setValue(60);
        priceDao.save(priceWeek);
    }
}
