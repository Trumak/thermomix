package com.rumak.service.recipe;

import com.rumak.dto.RecipeDto;
import com.rumak.exeption.ElementNotFound;

/**
 * Created by tomasz on 25.03.17.
 */
public interface Recipes {

    RecipeDto getRecipeBy(String name) throws ElementNotFound;

    void addRecipeToCollection(RecipeDto recipe) throws ElementNotFound;
}
