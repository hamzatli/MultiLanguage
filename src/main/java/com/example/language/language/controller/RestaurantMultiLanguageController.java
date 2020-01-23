package com.example.language.language.controller;


import com.example.language.language.model.Languages;
import com.example.language.language.model.RestaurantMultiLanguage;
import com.example.language.language.repository.RestaurantMultiLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Jan, 2020
 */
@RestController
@RequestMapping("/lang")
public class RestaurantMultiLanguageController {

    @Autowired
    private RestaurantMultiLanguageRepository languageRepository;



    @GetMapping("/{id}")
    public RestaurantMultiLanguage getOne (@PathVariable Integer id ,
                                            @RequestHeader("language") Languages language){

        return languageRepository.findRestaurantMultiLanguageByRestaurantIdAndAndLanguages(id , language);

    }

    @GetMapping
    public List<RestaurantMultiLanguage> restaurantMultiLanguageList(
            @RequestHeader("language") Languages language){

        return (List<RestaurantMultiLanguage>) languageRepository.findAllRestaurantMultiLanguageByLanguages(language);
    }

    // TODO: 23.01.20 @RequestHeader("language") Languages language ,

}
