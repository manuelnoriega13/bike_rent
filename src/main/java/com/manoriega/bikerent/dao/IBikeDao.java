package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBikeDao extends JpaRepository<Bike, Long> {
}
