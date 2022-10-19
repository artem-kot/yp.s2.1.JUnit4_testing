package ru.praktikum.yandex.service;

import ru.praktikum.yandex.model.Food;

public class ShoppingCart {
    Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double totalPriceWithoutDiscount(){
        double sum = 0;
        for (Food food : foods) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public double totalPriceWithDiscount(){
        double sum = 0;
        for (Food food : foods) {
            sum += food.getAmount() * food.getDiscountedPrice();
        }
        return sum;
    }

    public double totalVegetarianPriceWithoutDiscount(){
        double sum = 0;
        for (Food food : foods){
            if(food.isVegetarian()){
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}
