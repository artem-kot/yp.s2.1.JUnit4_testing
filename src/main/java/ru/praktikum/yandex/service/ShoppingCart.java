package ru.praktikum.yandex.service;

import ru.praktikum.yandex.model.Apple;
import ru.praktikum.yandex.model.Food;

public class ShoppingCart {
    Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    double totalPriceWithoutDiscount(){
        double sum = 0;
        for (Food food : foods) {
            sum += food.getPrice();
        }
        return sum;
    }

    double totalPriceWithDiscount(){
        double sum = 0;
        //code
        return sum;
    }

    double totalVegetarianPriceWithoutDiscount(){
        double sum = 0;
        for (Food food : foods){
            if(food.isVegetarian()){
                sum += food.getPrice();
            }
        }
        return sum;
    }
}
