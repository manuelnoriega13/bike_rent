package com.manoriega.bikerent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bike_rent")
public class BikeRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persons_id")
    private Person person;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "bike_rent_has_bikes",
            joinColumns = {@JoinColumn(name = "bike_rent_id")},
            inverseJoinColumns = {@JoinColumn(name = "bikes_id")}
    )
    private List<Bike> bikeList;


    @ManyToOne
    @JoinColumn(name = "prices_id")
    private Price price;

    @Column(name = "total_rent")
    private Integer totalRent;

    @Column(name = "rented")
    @Temporal(TemporalType.DATE)
    private Date rented;
}
