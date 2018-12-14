package com.manoriega.bikerent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "value")
    private Integer value;

//    @OneToMany
//    @Column(name = "fk_bike_rent_Prices1")
//    private List<BikeRent> bikeRentList;
}
