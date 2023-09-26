package seminars.seminar_6.warehouseManage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product implements ProductHelper{

    private String name;
    private int price;
    private int quantity;


    @Override
    public void decreaseQuantity(int amount) {
        this.quantity = quantity - amount;
    }

    @Override
    public void increaseQuantity(int amount) {
        this.quantity = quantity + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, quantity);
    }
}
