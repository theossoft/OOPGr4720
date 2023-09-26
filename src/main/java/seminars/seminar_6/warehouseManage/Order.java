package seminars.seminar_6.warehouseManage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Order {
    private int id;
    private Warehouse warehouse;

    public void processOrder(Product product, int amount) {
        if (warehouse.takeMyProduct(product, amount)) {
            System.out.println("Взяли " + product.toString() + amount);
        }
    }
}
