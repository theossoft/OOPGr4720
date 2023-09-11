package homeWorks.hw_2.players;

import java.util.Random;

public class Robot extends Player {
    private int distance;
    private int height;

    private Random r;

    public Robot() {
        r = new Random();
        height = r.nextInt(0, 10);
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

    private Robot(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Робот";
    }
}
