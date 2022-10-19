package ru.praktikum.yandex.model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getDiscountedPrice() {
        return price - (price * getDiscount() / 100);
    }
}
