package com.rumak.dto;

import lombok.Getter;

/**
 * Created by tomasz on 25.03.17.
 */
@Getter
public class RecipeQueryDto {

    private String recipeName;

    public String getRecipeName() {
        return recipeName;
    }
}
