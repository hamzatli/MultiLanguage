package com.example.language.language.controller;


import com.example.language.language.model.Languages;
import com.example.language.language.model.Restaurant;
import com.example.language.language.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Jan, 2020
 */
@RestController
@RequestMapping("/api")
public class RestaurantController {


    @Autowired
    private RestaurantRepository restaurantRepository;


    @GetMapping
    public List<Restaurant> getAllRestaurant(@RequestHeader("language") Languages language){

        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @PostMapping
    public void saveRestaurant( @RequestBody Restaurant restaurant){



        restaurantRepository.save(restaurant);
    }




}
