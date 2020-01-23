package com.example.language.language.repository;


import com.example.language.language.model.Languages;
import com.example.language.language.model.RestaurantMultiLanguage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Jan, 2020
 */
public interface RestaurantMultiLanguageRepository extends CrudRepository<RestaurantMultiLanguage, Integer> {


    RestaurantMultiLanguage findRestaurantMultiLanguageByRestaurantIdAndAndLanguages(Integer id , Languages languages);

    List<RestaurantMultiLanguage> findAllRestaurantMultiLanguageByLanguages(Languages languages);
}
