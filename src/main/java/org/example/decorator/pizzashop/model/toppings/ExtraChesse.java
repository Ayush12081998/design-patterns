package org.example.decorator.pizzashop.model.toppings;

import org.example.decorator.pizzashop.model.BasePizza;

import static org.example.decorator.pizzashop.constants.Price.EXTRA_CHESSE_PRICE;

public class ExtraChesse extends Topping {

    private final BasePizza pizza;

    public ExtraChesse(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + EXTRA_CHESSE_PRICE;
    }
}
