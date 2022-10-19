package ru.praktikum.yandex.service;

import org.junit.Test;
import ru.praktikum.yandex.model.Apple;
import ru.praktikum.yandex.model.Food;
import ru.praktikum.yandex.model.Meat;
import ru.praktikum.yandex.model.constants.Colour;

import static org.junit.Assert.*;


public class ShoppingCartTest extends BaseTestData{

    Meat meat = new Meat(5, 100);
    Apple applesRed = new Apple(10, 50, Colour.RED);
    Apple applesGreen = new Apple(8, 60, Colour.GREEN);

    Food[] foods = {meat, applesRed, applesGreen};
    ShoppingCart cart = new ShoppingCart(foods);

    @Test
    public void totalPriceWithoutDiscount() {
        assertEquals(TEST_DATA1_TOTAL_PRICE, cart.totalPriceWithoutDiscount(), 0);
    }

    @Test
    public void totalPriceWithDiscount() {

        assertEquals(TEST_DATA2_TOTAL_PRICE, cart.totalPriceWithDiscount(), 0);
    }

    @Test
    public void totalVegetarianPriceWithoutDiscount() {
        assertEquals(TEST_DATA3_TOTAL_PRICE, cart.totalVegetarianPriceWithoutDiscount(), 0);
    }
}