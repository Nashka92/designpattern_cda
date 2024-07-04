package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.Ingredient;

public class JapaneseIngredient extends Ingredient {
    @Override
    public void prepare() {
        System.out.print("\n Préparation des ingrédients japonais");
    }
}
