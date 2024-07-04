package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.Ingredient;

public class ItalianIngredient extends Ingredient {
    @Override
    public void prepare() {
        System.out.println("\nPréparation des ingrédients italien");
    }
}
