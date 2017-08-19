package com.rumak.domain;

import com.rumak.dto.RecipeDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by tomasz on 24.03.17.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "RECIPES")
public class Recipe extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private RecipesCollection collection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Ingredient> ingredients;


    public static Recipe from(RecipeDto recipeDto) {
        return Recipe.builder()
                .name(recipeDto.getRecipeName()).build();
    }
}
