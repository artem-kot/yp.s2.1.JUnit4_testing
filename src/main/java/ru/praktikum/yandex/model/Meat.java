package ru.praktikum.yandex.model;

public class Meat extends Food{

    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
