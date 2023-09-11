package homeWorks.hw_2.players;

import java.util.Random;

public class Cat extends Animal{

    private int distance;
    private int height;

    private Random r;

    public Cat() {
        r = new Random();
        height = r.nextInt(0, 6);
        distance = r.nextInt(0, 100);
    }

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

    @Override
    public String toString() {
        return "Кот";
    }
}
