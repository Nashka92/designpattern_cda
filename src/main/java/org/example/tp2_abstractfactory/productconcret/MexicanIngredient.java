package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.Ingredient;

public class MexicanIngredient extends Ingredient {
    @Override
    public void prepare() {
        System.out.print("\n Préparation des ingrédient mexicain");
    }
}
