package homeWorks.hw_2.barriers;

import homeWorks.hw_2.players.Player;


import java.util.Random;

public class Treadmill extends Barriers {
    private int distance = 25;


//    private Random r;

//    public Treadmill() {
//        r = new Random();
//        distance = r.nextInt(0, 200);
//    }

    public int getDistance() {
        return distance;
    }

    public void start(Player player) {
        if (player.getDistance() > distance) {
            System.out.println(player + " прошел дистанцию " + distance + " метров.");
        } else {
            System.out.println(player + " не прошел дистанцию " + distance + " метров.");
        }
    }
}
