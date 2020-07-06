package org.alexjw.restaurantiumspring;

import org.alexjw.restaurantiumspring.repositories.IngredientRepository;
import org.alexjw.restaurantiumspring.services.IngredientService;
import org.alexjw.restaurantiumspring.services.IngredientServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantiumSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantiumSpringApplication.class, args);
    }

}
