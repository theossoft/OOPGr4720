package seminars.seminar_6.warehouseManage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import seminars.seminar_6.libraryManage.Library;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse implements WarehouseHelper {
    private List<Product> warehouse = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        warehouse.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        warehouse.remove(product);
    }

    public boolean takeMyProduct(Product product, int amount) {
        for (Product product1 : warehouse) {
            if (product1.equals(product)) {
                if (product1.getQuantity() > amount) {
                    product1.decreaseQuantity(amount);
                    return true;
                } else {
                    System.out.println("Не хватает продукта");
                }
            }
        }
        return false;
    }
}
