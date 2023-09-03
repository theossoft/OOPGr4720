package homeWorks.hw_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public String toString() {
        return
                "наименование: " + name +
                ", цена: " + price + " руб." +
                ", рейтинг: " + rating +
                "\n";
    }
}
