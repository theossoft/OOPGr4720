package homeWorks.hw_2.players;

public class Cat extends Animal{

    private int distance;
    private int height;

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHeight() {
        return height;
    }

    private Cat(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public Cat() {
        this(20, 4);
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
