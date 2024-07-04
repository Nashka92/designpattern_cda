package org.example;

import org.example.tp1_builder.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .taille("Moyenne")
                .typeDePate("Fine")
                .fromage("Mozarella")
                .ajouterGarniture("Jambon", "Champignon")
                .sauce("Tomate")
                .build();
    }
}
