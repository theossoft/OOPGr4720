package homeWorks.hw_1;


import java.util.List;

public class Market {
    List<Product> products;
    User user;
    Basket basket;

    public Market(List<Product> products, User user) {
        this.products = products;
        this.user = user;
        products.removeAll(user.getPurchasedGoods().getPurchasedGoods());
    }


}
