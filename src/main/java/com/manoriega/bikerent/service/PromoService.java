package com.manoriega.bikerent.service;

import com.manoriega.bikerent.dao.IBikeDao;
import com.manoriega.bikerent.dao.IBikeRentDao;
import com.manoriega.bikerent.dto.Promo;
import com.manoriega.bikerent.model.BikeRent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromoService {

    @Autowired
    private IBikeRentDao bikeRentDao;

    public List<Promo> getAllPromo() {
        List<BikeRent> bikeList = bikeRentDao.findAll();
        List<Promo> promoList = new ArrayList<>();

        for (BikeRent bikeRent : bikeList) {
            if (bikeRent.getBikeList().size() >= 3 && bikeRent.getBikeList().size() <= 5) {
                Promo promof = new Promo();
                Integer amountPromo = bikeRent.getPrice().getValue() * bikeRent.getTotalRent();
                Integer promo = (amountPromo) * 30 / 100;
                Integer finalPromo = amountPromo - promo;
                promof.setPrice(amountPromo);
                promof.setFinalPrice(finalPromo);
                promof.setPerson(bikeRent.getPerson().getName());
                promof.setBikes(bikeRent.getBikeList().size());
                promof.setRented(bikeRent.getRented().toString());
                promof.setAmong(bikeRent.getTotalRent().toString());
                promof.setTime(bikeRent.getPrice().getDescription());
                promoList.add(promof);
                System.out.println(finalPromo);
            } else if (bikeRent.getBikeList().size() <= 3 || bikeRent.getBikeList().size() >= 5) {
                Promo promof = new Promo();
                Integer amountPromo = bikeRent.getPrice().getValue() * bikeRent.getTotalRent();
                promof.setPerson(bikeRent.getPerson().getName());
                promof.setRented(bikeRent.getRented().toString());
                promof.setTime(bikeRent.getPrice().getDescription());
                promof.setAmong(bikeRent.getTotalRent().toString());
                promof.setPrice(amountPromo);
                promof.setBikes(bikeRent.getBikeList().size());
                promof.setFinalPrice(amountPromo);
                promoList.add(promof);
            }
        }
        return promoList;
    }
}
