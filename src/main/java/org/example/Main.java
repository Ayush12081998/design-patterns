package org.example;

import org.example.decorator.pizzashop.model.BasePizza;
import org.example.decorator.pizzashop.model.pizza.FarmhousePizza;
import org.example.decorator.pizzashop.model.toppings.ExtraChesse;
import org.example.decorator.pizzashop.model.toppings.ExtraVegetable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculate price for extra chess extra vegetable pizza!");
        final BasePizza farmhousePizza = new ExtraChesse(new ExtraVegetable(new FarmhousePizza()));
        System.out.println("Price : " + farmhousePizza.getPrice());
    }
}