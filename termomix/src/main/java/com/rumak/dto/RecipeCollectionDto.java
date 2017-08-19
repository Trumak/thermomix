package com.rumak.dto;

import com.rumak.domain.RecipesCollection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by tomasz on 25.03.17.
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeCollectionDto {

    private String collectionName;

    public static RecipeCollectionDto create(RecipesCollection collection) {
        return RecipeCollectionDto.builder()
                .collectionName(collection.getName())
                .build();
    }
}
