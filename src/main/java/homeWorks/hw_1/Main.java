package homeWorks.hw_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> appliances = new ArrayList<>();
        appliances.add(new Product("Микроволновка", 4000.00, 5));
        appliances.add(new Product("Телевизор", 6000.00, 4));
        appliances.add(new Product("Холодильник", 7000.00, 5));
        appliances.add(new Product("Утюг", 500.00, 5));
        appliances.add(new Product("Стол", 1500.00, 3));
        List<Product> food = new ArrayList<>();
        food.add(new Product("Колбаса", 50.00, 3));
        food.add(new Product("Мясо", 68.00, 3));
        food.add(new Product("Яблоки", 23.00, 3));
        appliances.add(new Product("Колбаса", 200.50, 2));

        Category category1 = new Category("Бытовая техника", appliances);
        Category category2 = new Category("Еда", food);

        Basket basket1 = new Basket();
        basket1.addToBasketProducts(food);
        User user1 = new User("login", "password", basket1);
        System.out.println(category1);

        Shop shop = new Shop();
        shop.addProducts(appliances);
        shop.addProducts(food);
        System.out.println("Магазин до покупки");
        shop.printListOfProducts();
        shop.addUser(user1);
        shop.buyProducts();
        System.out.println("Магазин после покупки");
        shop.printListOfProducts();
    }
}
