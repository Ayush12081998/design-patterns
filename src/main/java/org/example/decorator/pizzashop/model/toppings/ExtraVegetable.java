package org.example.decorator.pizzashop.model.toppings;

import org.example.decorator.pizzashop.model.BasePizza;

import static org.example.decorator.pizzashop.constants.Price.EXTRA_VEGETABLE_PRICE;

public class ExtraVegetable extends Topping {

    private final BasePizza pizza;

    public ExtraVegetable(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + EXTRA_VEGETABLE_PRICE;
    }
}
