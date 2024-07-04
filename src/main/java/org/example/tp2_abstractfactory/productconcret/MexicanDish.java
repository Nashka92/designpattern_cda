package org.example.tp2_abstractfactory.productconcret;

import org.example.tp2_abstractfactory.productabstract.Dish;

public class MexicanDish extends Dish {
    @Override
    public void serve() {
        System.out.print("\n Service des plats mexicains");
    }
}
