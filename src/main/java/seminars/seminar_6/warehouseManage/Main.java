package seminars.seminar_6.warehouseManage;

import lections.lection_2.Ex003.alliance.Worgen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 50, 10);
        Product bread = new Product("Хлеб", 20, 50);
        Product apple = new Product("Яблоко", 10, 100);
        Product alcohol = new Alcohol("Водяра", 100, 5, 20);
        Warehouse warehouse = new Warehouse(Arrays.asList(milk, bread, apple, alcohol));
        Order order = new Order(1, warehouse);
        order.processOrder(milk, 5);
        order.processOrder(milk, 7);
        order.processOrder(alcohol, 3);
    }
}
