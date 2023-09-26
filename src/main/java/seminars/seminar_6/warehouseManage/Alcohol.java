package seminars.seminar_6.warehouseManage;

import lombok.AllArgsConstructor;


public class Alcohol extends Product{
    private int age;

    public Alcohol(String name, int price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public Alcohol(int age) {
        this.age = age;
    }

    public boolean canBuy(int age) {
        if(age > 18) return true;
        return false;
    }
}
