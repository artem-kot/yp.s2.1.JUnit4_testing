package ru.praktikum.yandex.model;

import java.util.Locale;
import java.util.Objects;

public class Apple extends Food implements Discountable{
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }


    @Override
    public double getDiscount() {
        if(Objects.equals(colour, "red")){
            return 60;
        }
        return 0;
    }

    public double getDiscountedPrice() {
        return price - (price * getDiscount() / 100);
    }
}
