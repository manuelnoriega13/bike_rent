package com.manoriega.bikerent.service;

import com.manoriega.bikerent.dao.IPersonDao;
import com.manoriega.bikerent.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private IPersonDao personDao;

    public Optional<Person> findById(Long id){
        return personDao.findById(id);
    }

    public List<Person> findAllPerson(){
        return personDao.findAll();
    }

}
