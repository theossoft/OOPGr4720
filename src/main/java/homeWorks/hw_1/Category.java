package homeWorks.hw_1;

import lombok.Data;


import java.util.List;

@Data
public class Category {
    private String name;
    List<Product> list;

    public Category(String name, List<Product> list) {
        this.name = name;
        this.list = list;
    }
}
