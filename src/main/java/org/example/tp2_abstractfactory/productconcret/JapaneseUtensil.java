package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.CookingUtensil;

public class JapaneseUtensil extends CookingUtensil {
    @Override
    public void use() {
        System.out.print("\n Utilisations des ustensiles japonais");
    }
}
