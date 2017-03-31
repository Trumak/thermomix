package com.rumak.web;

import com.rumak.domain.RecipesCollection;
import com.rumak.dto.RecipeCollectionDto;
import com.rumak.dto.RecipeDto;
import com.rumak.dto.RecipeQueryDto;
import com.rumak.exeption.ElementNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.rumak.service.collection.RecipesCollections;
import com.rumak.service.recipe.Recipes;

/**
 * Created by tomasz on 25.03.17.
 */
@RestController
@RequestMapping(path = "/api")
public class RecipeController {

    private final Recipes recipes;
    private final RecipesCollections collections;

    @Autowired
    public RecipeController(Recipes recipes,
                            RecipesCollections collections) {
        this.recipes = recipes;
        this.collections = collections;
    }

    @RequestMapping(path = "/recipes/{recipe_name}")
    @ResponseStatus(HttpStatus.OK)
    public RecipeDto getRecipe(@PathVariable("recipe_name") String recipeName) throws ElementNotFound {
        return recipes.getRecipeBy(recipeName);
    }

    @RequestMapping(path = "/collection",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public RecipeCollectionDto addCollection(@RequestBody RecipeCollectionDto collectionDto){
        return collections.saveCollection(collectionDto);
    }

    @RequestMapping(path = "/recipe", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addRecipeToCollection(@RequestBody RecipeDto recipe) throws ElementNotFound {
        recipes.addRecipeToCollection(recipe);
    }
}
