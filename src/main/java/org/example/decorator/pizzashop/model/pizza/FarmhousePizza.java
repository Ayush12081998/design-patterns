package org.example.decorator.pizzashop.model.pizza;

import org.example.decorator.pizzashop.model.BasePizza;

import static org.example.decorator.pizzashop.constants.Price.FARM_HOUSE_PIZZA_PRICE;

public class FarmhousePizza extends BasePizza {

    @Override
    public double getPrice() {
        return FARM_HOUSE_PIZZA_PRICE;
    }
}
