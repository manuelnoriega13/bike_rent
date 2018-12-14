package com.manoriega.bikerent.service;


import com.manoriega.bikerent.model.Bike;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBikeService {

    @Autowired
    private BikeService bikeService;

    @Test
    public void testSave() {
        Bike bike = new Bike();
        bike.setType("test");
        bikeService.Save(bike);
    }

    @Test
    public void testFindById() {
        Optional<Bike> bike = bikeService.getById(991L);
        Assert.notNull(bike.get());

    }

    @Test
    public void testDelete() {
        Optional<Bike> bike = bikeService.getById(3L);
        Boolean resp = bikeService.delete(bike.get());
        Assert.isTrue(resp);

    }

    @Test
    public void testgetAll() {
        List<Bike> bikeList = bikeService.getAll();
        Assert.notNull(bikeList);
    }

    @Test
    public void update(){
        Optional<Bike> bike = bikeService.getById(4L);
        bike.get().setType("c");
        bikeService.update(bike.get());
        Assert.notNull(bike.get());
    }
}
