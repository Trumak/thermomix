package com.rumak.dto;

import com.rumak.domain.Recipe;
import lombok.*;

/**
 * Created by tomasz on 25.03.17.
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
public class RecipeDto {

    private String recipeName;
    private String collectionName;

    public static RecipeDto create(Recipe recipe) {
        return RecipeDto.builder()
                .recipeName(recipe.getName())
                .collectionName(recipe.getCollection().getName())
                .build();
    }

}
