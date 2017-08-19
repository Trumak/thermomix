package com.rumak.service.collection;

import com.rumak.dto.RecipeCollectionDto;
import com.rumak.exeption.ElementNotFound;

import java.util.List;

/**
 * Created by tomasz on 25.03.17.
 */
public interface RecipesCollections {

    RecipeCollectionDto getCollection(String name) throws ElementNotFound;

    RecipeCollectionDto saveCollection(RecipeCollectionDto collectionDto);

    List<RecipeCollectionDto> getAllCollections();

}
