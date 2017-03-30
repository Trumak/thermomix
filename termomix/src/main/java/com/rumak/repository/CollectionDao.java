package com.rumak.repository;

import com.rumak.domain.RecipesCollection;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by tomasz on 25.03.17.
 */
@Repository
public interface CollectionDao extends BaseDao<RecipesCollection,Long> {

    Optional<RecipesCollection> findByName(String name);

}
