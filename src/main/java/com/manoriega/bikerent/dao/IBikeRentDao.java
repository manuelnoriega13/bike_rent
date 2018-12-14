package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.BikeRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBikeRentDao extends JpaRepository<BikeRent, Long> {


}
