package com.manoriega.bikerent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "persons")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "direction")
    private String direction;

    @Column(name = "phone_number")
    private String phoneNumer;

//    @OneToMany
//    @JoinColumn(name = "fk_bike_rent_Persons")
//    private List<Bike> bikeList;
}
