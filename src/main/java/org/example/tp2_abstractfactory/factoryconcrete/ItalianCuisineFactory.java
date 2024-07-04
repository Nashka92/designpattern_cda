package org.example.tp2_abstractfactory.factoryconcrete;

import org.example.tp2_abstractfactory.abstractfactory.CuisineFactory;
import org.example.tp2_abstractfactory.productabstract.CookingUtensil;
import org.example.tp2_abstractfactory.productabstract.Dish;
import org.example.tp2_abstractfactory.productabstract.Ingredient;
import org.example.tp2_abstractfactory.productconcret.ItalianDish;
import org.example.tp2_abstractfactory.productconcret.ItalianIngredient;
import org.example.tp2_abstractfactory.productconcret.ItalianUtensil;

public class ItalianCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new ItalianIngredient();
    }

    @Override
    public CookingUtensil createUtensil() {
        return new ItalianUtensil();
    }

    @Override
    public Dish createDish() {
        return new ItalianDish();
    }
}
