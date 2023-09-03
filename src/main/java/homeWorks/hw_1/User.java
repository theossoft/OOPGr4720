package homeWorks.hw_1;

public class User {
    private String login;
    private String password;
    public Basket purchasedGoods;

    public User(String login, String password, Basket purchasedGoods) {
        this.login = login;
        this.password = password;
        this.purchasedGoods = purchasedGoods;
    }

    public Basket getPurchasedGoods() {
        return purchasedGoods;
    }
}
