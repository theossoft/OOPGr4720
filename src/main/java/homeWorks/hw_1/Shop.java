package homeWorks.hw_1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> listOfShopProducts = new ArrayList<>();
    private User user;
    private Basket basket;

    public void addProducts(Product product) {
        listOfShopProducts.add(product);
    }

    public void addProducts(List<Product> products) {
        listOfShopProducts.addAll(products);
    }

    public List<Product> getListOfShopProducts() {
        return listOfShopProducts;
    }

    public void printListOfProducts() {
        for (Product p : getListOfShopProducts()) {
            System.out.print(p);
        }
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addUser(User user) {
        this.user = user;
        basket = user.getPurchasedGoods();
    }

    public void buyProducts() {
        listOfShopProducts.removeAll(basket.getPurchasedGoods());
    }
}


