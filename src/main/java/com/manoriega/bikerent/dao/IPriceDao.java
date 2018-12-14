package com.manoriega.bikerent.dao;

import com.manoriega.bikerent.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPriceDao extends JpaRepository<Price, Long> {
}
