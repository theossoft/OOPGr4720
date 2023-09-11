package homeWorks.hw_2;

import homeWorks.hw_2.barriers.Barriers;
import homeWorks.hw_2.barriers.Treadmill;
import homeWorks.hw_2.barriers.Wall;
import homeWorks.hw_2.players.Cat;
import homeWorks.hw_2.players.Human;
import homeWorks.hw_2.players.Player;
import homeWorks.hw_2.players.Robot;

public class Main {


    public static void main(String[] args) {

        Player[] players = {new Robot(), new Human(), new Cat(), new Robot(), new Human(), new Cat()};
        Barriers[] barriers = {new Treadmill(), new Wall(), new Treadmill(), new Wall()};
        for (Barriers barrier : barriers) {
            for (Player player : players) {
                System.out.print(player + " начал испытание. ");
                if (!barrier.getFlag()) {
                    barrier.start(player);
                } else {
                    System.out.println("Испытание для " + player + " завершено.");
                    break;
                }

            }
        }
    }
}
