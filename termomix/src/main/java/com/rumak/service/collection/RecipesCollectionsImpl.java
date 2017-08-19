package com.rumak.service.collection;

import com.rumak.domain.RecipesCollection;
import com.rumak.dto.RecipeCollectionDto;
import com.rumak.exeption.ElementNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rumak.repository.CollectionDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return RecipeCollectionDto.create(collection.get());
    }

    @Override
    @Transactional
    public RecipeCollectionDto saveCollection(RecipeCollectionDto collectionDto) {
        collectionDao.save(RecipesCollection.from(collectionDto));
        return collectionDto;
    }

    @Override
    public List<RecipeCollectionDto> getAllCollections() {
        final List<RecipesCollection> collections = collectionDao.findAll();
        return collections.stream()
                .map(RecipeCollectionDto::create)
                .collect(Collectors.toList());
    }
}
