package org.example.tp2_abstractfactory.client;

import org.example.tp2_abstractfactory.abstractfactory.CuisineFactory;
import org.example.tp2_abstractfactory.productabstract.CookingUtensil;
import org.example.tp2_abstractfactory.productabstract.Dish;
import org.example.tp2_abstractfactory.productabstract.Ingredient;

public class Restaurant {
    private CuisineFactory cuisineFactory;

    public void setCuisineFactory(CuisineFactory factory) {
        this.cuisineFactory = factory;
    }

    public void prepareMeal() {
        Ingredient ingredient = cuisineFactory.createIngredient();
        CookingUtensil utensil = cuisineFactory.createUtensil();
        Dish dish = cuisineFactory.createDish();

        ingredient.prepare();
        utensil.use();
        dish.serve();
    }
}

