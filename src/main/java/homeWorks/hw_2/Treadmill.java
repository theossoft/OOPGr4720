package homeWorks.hw_2;

import java.util.Random;

public class Treadmill {
    private int distance;
    private Random r;

    public Treadmill() {
        r = new Random();
        distance = r.nextInt(0, 200);
    }

    public int getDistance() {
        return distance;
    }
}
