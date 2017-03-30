package com.rumak.repository;

import com.rumak.domain.Recipe;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by tomasz on 25.03.17.
 */
@Repository
public interface RecipesDao extends BaseDao<Recipe, Long> {

    Optional<Recipe> findByName(String name);
}
