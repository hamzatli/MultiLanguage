package com.example.language.language.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ismayil Hamzatli on Jan, 2020
 */
@Data
@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "site")
    private String site;

    @Column(name = "phone_number")
    private String phoneNumber;

}
