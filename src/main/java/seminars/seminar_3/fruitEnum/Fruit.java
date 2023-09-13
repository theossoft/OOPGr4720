package seminars.seminar_3.fruitEnum;

public enum Fruit {
    APPLE("Яблоко"), LEMON("Лемон"), WARERLEMON, CHERRY, PITCH;
    private String name;
    Fruit(String name) {
        this.name = name;
    }
    Fruit() {}

    public String getName() {
        return name;
    }
}
