package com.rumak.domain;

import com.rumak.dto.RecipeCollectionDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tomasz on 24.03.17.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "COLLECTIONS")
public class RecipesCollection extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "collection", fetch = FetchType.LAZY)
    private List<Recipe> recipes;

    public static RecipesCollection from(RecipeCollectionDto collectionDto) {
        return RecipesCollection.builder()
                .name(collectionDto.getCollectionName()).build();
    }
}
