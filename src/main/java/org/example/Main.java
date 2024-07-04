package org.example;

import org.example.tp1_builder.pizza.Pizza;
import org.example.tp2_abstractfactory.client.Restaurant;
import org.example.tp2_abstractfactory.factoryconcrete.ItalianCuisineFactory;
import org.example.tp2_abstractfactory.factoryconcrete.JapaneseCuisineFactory;
import org.example.tp2_abstractfactory.factoryconcrete.MexicanCuisineFactory;

public class Main {
    public static void main(String[] args) {
//        Pizza pizza = new Pizza.PizzaBuilder()
//                .taille("Moyenne")
//                .typeDePate("Fine")
//                .fromage("Mozarella")
//                .ajouterGarniture("Jambon", "Champignon")
//                .sauce("Tomate")
//                .build();

        Restaurant restaurant = new Restaurant();
        System.out.print("\nPréparation d'un repas italien ");
        restaurant.setCuisineFactory(new ItalianCuisineFactory());
        restaurant.prepareMeal();

        System.out.print("\nPréparation d'un repas japonais " );
        restaurant.setCuisineFactory(new JapaneseCuisineFactory());
        restaurant.prepareMeal();

        System.out.print("\nPréparation d'un repas Mexicain ");
        restaurant.setCuisineFactory(new MexicanCuisineFactory());
        restaurant.prepareMeal();

//
    }

}