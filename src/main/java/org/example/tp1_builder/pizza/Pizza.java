package org.example.tp1_builder.pizza;

import java.util.ArrayList;
import java.util.List;

// définir une classe pizza
public class Pizza {
    private String taille;
    private String pate;
    private String fromage;
    private List<String> garnitures;
    private String sauce;

    // créer la classe Builder Interne
    private Pizza(PizzaBuilder pizzaBuilder){
        this.taille = pizzaBuilder.taille;
        this.pate = pizzaBuilder.pate;
        this.fromage = pizzaBuilder.fromage;
        this.garnitures = pizzaBuilder.garnitures;
        this.sauce = pizzaBuilder.sauce;
    }

    // classe statique Builder
    public static class PizzaBuilder{
        private String taille;
        private String pate;
        private String fromage;
        private List<String> garnitures = new ArrayList<>();
        private String sauce;

        // méthode pour définir la taille
        public PizzaBuilder taille(String taille) {
            this.taille = taille;
            return this;
        }

        // méthode pour définir le type de pâte
        public PizzaBuilder typeDePate(String pate) {
            this.pate = pate;
            return this;
        }

        // méthode pour définir le fromage
        public PizzaBuilder fromage(String fromage) {
            this.fromage = fromage;
            return this;
        }

        // méthode pour ajouter une ou plusieurs garnitures
        // celui-ci est particulier car il accepte plusieurs arguments
        public PizzaBuilder ajouterGarniture(String... garnitures) {
            for (String garniture : garnitures) {
                this.garnitures.add(garniture);
            }
            return this;
        }

        // méthode pour définir la sauce
        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        // méthode pour construire l'objet Pizza
        public Pizza build() {
            return new Pizza(this);
        }
    }

}

