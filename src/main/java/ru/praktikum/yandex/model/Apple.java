package ru.praktikum.yandex.model;

import ru.praktikum.yandex.model.constants.Colour;
import ru.praktikum.yandex.model.constants.Discount;

import java.util.Objects;

public class Apple extends Food{
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }


    @Override
    public double getDiscount() {
        if(Objects.equals(colour, Colour.RED)){
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}
