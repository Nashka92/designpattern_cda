package org.example.tp2_abstractfactory.factoryconcrete;

import org.example.tp2_abstractfactory.abstractfactory.CuisineFactory;
import org.example.tp2_abstractfactory.productabstract.CookingUtensil;
import org.example.tp2_abstractfactory.productabstract.Dish;
import org.example.tp2_abstractfactory.productabstract.Ingredient;
import org.example.tp2_abstractfactory.productconcret.JapaneseDish;
import org.example.tp2_abstractfactory.productconcret.JapaneseIngredient;
import org.example.tp2_abstractfactory.productconcret.JapaneseUtensil;

public class JapaneseCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new JapaneseIngredient();
    }

    @Override
    public CookingUtensil createUtensil() {
        return new JapaneseUtensil();
    }

    @Override
    public Dish createDish() {
        return new JapaneseDish();
    }
}
