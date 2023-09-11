package homeWorks.hw_2.players;

import java.util.Random;

public class Human extends Animal{
    private int distance;
    private int height;

    private Random r;

    public Human() {
        r = new Random();
        height = r.nextInt(0, 4);
        distance = r.nextInt(0, 200);
    }

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


    @Override
    public String toString() {
        return "Человек";
    }
}
