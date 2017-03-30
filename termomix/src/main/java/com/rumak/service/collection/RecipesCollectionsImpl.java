package com.rumak.service.collection;

import com.rumak.domain.RecipesCollection;
import com.rumak.dto.RecipeCollectionDto;
import com.rumak.exeption.ElementNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rumak.repository.CollectionDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by tomasz on 25.03.17.
 */
@Service
class RecipesCollectionsImpl implements RecipesCollections {

    private final CollectionDao collectionDao;

    @Autowired
    protected RecipesCollectionsImpl(CollectionDao collectionDao){
        this.collectionDao = collectionDao;
    }

    @Override
    public RecipeCollectionDto getCollection(String name) throws ElementNotFound {
        Optional<RecipesCollection> collection = collectionDao.findByName(name);
        if (!collection.isPresent()){
            throw new ElementNotFound();
        }
        return new RecipeCollectionDto();
    }

    @Override
    @Transactional
    public RecipeCollectionDto saveCollection(RecipeCollectionDto collectionDto) {
        collectionDao.save(RecipesCollection.from(collectionDto));
        return collectionDto;
    }
}
