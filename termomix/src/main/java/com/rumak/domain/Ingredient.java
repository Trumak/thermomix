package com.rumak.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by tomasz on 24.03.17.
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Ingredients")
public class Ingredient extends BaseEntity {

    @Column(name = "NAME")
    private String name;
    @Column(name = "AMOUNT")
    private int amount;
    @Column(name = "UNIT")
    @Enumerated
    private Unit unit;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Recipe recipe;
}
