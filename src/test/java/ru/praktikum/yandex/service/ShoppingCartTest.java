package ru.praktikum.yandex.service;

import org.junit.Test;
import ru.praktikum.yandex.model.Apple;
import ru.praktikum.yandex.model.Food;
import ru.praktikum.yandex.model.Meat;
import ru.praktikum.yandex.model.constants.Colour;

import static org.junit.Assert.*;


public class ShoppingCartTest {

    Meat meat = new Meat(5, 100);
    Apple applesRed = new Apple(10, 50, Colour.red);
    Apple applesGreen = new Apple(8, 60, Colour.green);

    Food[] foods = {meat, applesRed, applesGreen};
    ShoppingCart cart = new ShoppingCart(foods);

    @Test
    public void totalPriceWithoutDiscount() {
        assertEquals(1480, cart.totalPriceWithoutDiscount(), 0);
    }

    @Test
    public void totalPriceWithDiscount() {
        assertEquals(1180, cart.totalPriceWithDiscount(), 0);
    }

    @Test
    public void totalVegetarianPriceWithoutDiscount() {
        assertEquals(980, cart.totalVegetarianPriceWithoutDiscount(), 0);
    }
}