package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao extends JpaRepository<Person, Long> {
}
