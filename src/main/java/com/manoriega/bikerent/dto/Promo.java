package com.manoriega.bikerent.dto;

import com.manoriega.bikerent.model.BikeRent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Promo {

    private String Person;
    private String rented;
    private String time;
    private String among;
    private Integer bikes;
    private Integer price;
    private Integer finalPrice;

}
