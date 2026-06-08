package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Без скидки
    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Со скидкой
    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double sum = item.getAmount() * item.getPrice();
            sum = sum - sum * item.getDiscount() / 100;
            total += sum;
                }
        return total;
    }

    // Вегетарианские без скидки
    public double getVegetarianTotal() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
