package org.example.tp2_abstractfactory.factoryconcrete;

import org.example.tp2_abstractfactory.abstractfactory.CuisineFactory;
import org.example.tp2_abstractfactory.productabstract.CookingUtensil;
import org.example.tp2_abstractfactory.productabstract.Dish;
import org.example.tp2_abstractfactory.productabstract.Ingredient;
import org.example.tp2_abstractfactory.productconcret.MexicanDish;
import org.example.tp2_abstractfactory.productconcret.MexicanIngredient;
import org.example.tp2_abstractfactory.productconcret.MexicanUtensil;

public class MexicanCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new MexicanIngredient();
    }

    @Override
    public CookingUtensil createUtensil() {
        return new MexicanUtensil();
    }

    @Override
    public Dish createDish() {
        return new MexicanDish();
    }
}
