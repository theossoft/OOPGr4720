package homeWorks.hw_1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> purchasedGoods;

    public Basket(List<Product> purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

    public List<Product> getPurchasedGoods () {
        return purchasedGoods;
    }
}
