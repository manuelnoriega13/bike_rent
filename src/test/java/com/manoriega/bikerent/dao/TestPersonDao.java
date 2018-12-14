package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPersonDao {

    @Autowired
    private IPersonDao personDao;

    @Test
    public void testSavePerson(){
        Person person = new Person();
        person.setDirection("dir a");
        person.setName("manuel");
        person.setPhoneNumer("+58112546");
        personDao.save(person);

    }
}
