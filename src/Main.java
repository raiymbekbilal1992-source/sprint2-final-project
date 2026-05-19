import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // Данные
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        // Массив продуктов
        Food[] items = {meat, redApples, greenApples};

        // Корзина
        ShoppingCart cart = new ShoppingCart(items);

        // Вывод
        System.out.println("Сумма без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Сумма со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Вегетарианские продукты: " + cart.getVegetarianTotal());
    }
}