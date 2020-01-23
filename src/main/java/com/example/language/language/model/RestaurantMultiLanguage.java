package com.example.language.language.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ismayil Hamzatli on Jan, 2020
 */
@Data
@Entity
@Table(name = "restaurant_multilanguage")
public class RestaurantMultiLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "language")
    private Languages languages;

    @ManyToOne
    private Restaurant restaurant;



}
