package ru.praktikum.yandex;

import ru.praktikum.yandex.model.Apple;
import ru.praktikum.yandex.model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(4, 100, Colour.red);
        System.out.println(apple.getDiscountedPrice());

    }
}