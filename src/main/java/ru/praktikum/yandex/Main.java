package ru.praktikum.yandex;

import ru.praktikum.yandex.model.Apple;
import ru.praktikum.yandex.model.Food;
import ru.praktikum.yandex.model.Meat;
import ru.praktikum.yandex.model.constants.Colour;
import ru.praktikum.yandex.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple applesRed = new Apple(10, 50, Colour.red);
        Apple applesGreen = new Apple(8, 60, Colour.green);

        Food[] foods = {meat, applesRed, applesGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.totalPriceWithoutDiscount());
        System.out.println(cart.totalPriceWithDiscount());
        System.out.println(cart.totalVegetarianPriceWithoutDiscount());



    }
}