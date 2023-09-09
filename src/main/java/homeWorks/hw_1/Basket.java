package homeWorks.hw_1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> purchasedGoods = new ArrayList<>();

   public void addToBasketProducts(Product product) {
       purchasedGoods.add(product);
   }
    public void addToBasketProducts(List<Product> products) {
        purchasedGoods.addAll(products);
    }


    public List<Product> getPurchasedGoods () {
        return purchasedGoods;
    }
}
