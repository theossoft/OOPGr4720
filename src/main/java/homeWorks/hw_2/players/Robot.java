package homeWorks.hw_2.players;

public class Robot extends Player {
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

    private Robot(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public Robot() {
        this(50, 10);
    }

    @Override
    public String toString() {
        return "Робот";
    }
}
