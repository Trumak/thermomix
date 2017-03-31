package com.rumak.service.recipe;

import com.rumak.domain.Recipe;
import com.rumak.domain.RecipesCollection;
import com.rumak.dto.RecipeDto;
import com.rumak.exeption.ElementNotFound;
import com.rumak.repository.CollectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rumak.repository.RecipesDao;

import java.util.Optional;

/**
 * Created by tomasz on 25.03.17.
 */

@Service
class RecipeImpl implements Recipes {

    private final RecipesDao recipesDao;
    private final CollectionDao collectionDao;

    @Autowired
    public  RecipeImpl(RecipesDao recipesDao,
                       CollectionDao collectionDao) {
        this.recipesDao = recipesDao;
        this.collectionDao = collectionDao;
    }


    @Override
    public RecipeDto getRecipeBy(String name) throws ElementNotFound {
        Optional<Recipe> recipe = recipesDao.findByName(name);
        if(!recipe.isPresent()){
            throw new ElementNotFound();
        }
        return RecipeDto.create(recipe.get());
    }

    @Override
    public void addRecipeToCollection(RecipeDto recipe) throws ElementNotFound {
        final String collectionName = recipe.getCollectionName();
        final Optional<RecipesCollection> recipesCollection = collectionDao.findByName(collectionName);
        if(!recipesCollection.isPresent()) {
            throw new ElementNotFound();
        }
        Recipe recipeToSave = Recipe.from(recipe);
        recipeToSave.setCollection(recipesCollection.get());
        recipesDao.save(recipeToSave);
    }
}
