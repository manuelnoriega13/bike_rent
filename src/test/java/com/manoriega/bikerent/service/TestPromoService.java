package com.manoriega.bikerent.service;

import com.manoriega.bikerent.dto.Promo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPromoService {

    @Autowired
    private PromoService promoService;

    @Test
    public void testPromoService() {
        List<Promo> promoList = promoService.getAllPromo();
    }
}
