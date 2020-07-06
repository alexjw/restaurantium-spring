package org.alexjw.restaurantiumspring.domains;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Ingredient extends BaseDomain {

    private String name;

}
