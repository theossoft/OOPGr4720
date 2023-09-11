package homeWorks.hw_2.players;

public class Human extends Animal{
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

    private Human(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public Human() {
        this(40, 2);
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
