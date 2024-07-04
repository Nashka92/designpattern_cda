package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.CookingUtensil;

public class ItalianUtensil extends CookingUtensil {
    @Override
    public void use() {
        System.out.println("\n Utilisation des ustensiles italiens");
    }
}
