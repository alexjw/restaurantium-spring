package org.alexjw.restaurantiumspring.repositories;

import org.alexjw.restaurantiumspring.domains.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
