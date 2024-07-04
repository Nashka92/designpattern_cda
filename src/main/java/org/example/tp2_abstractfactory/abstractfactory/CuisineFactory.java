package org.example.tp2_abstractfactory.abstractfactory;

import org.example.tp2_abstractfactory.productabstract.CookingUtensil;
import org.example.tp2_abstractfactory.productabstract.Dish;
import org.example.tp2_abstractfactory.productabstract.Ingredient;

public abstract class CuisineFactory {
    public abstract Ingredient createIngredient();
    public abstract CookingUtensil createUtensil();
    public abstract Dish createDish();
}

