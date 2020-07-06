package org.alexjw.restaurantiumspring.services;

import org.alexjw.restaurantiumspring.domains.Ingredient;
import org.alexjw.restaurantiumspring.repositories.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl extends BaseService<Ingredient, IngredientRepository> implements IngredientService {

    public IngredientServiceImpl(IngredientRepository repository) {
        super(repository);
    }

}
