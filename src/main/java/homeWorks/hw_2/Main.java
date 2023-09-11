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
        Player robot = new Robot();
        Player human = new Human();
        Player cat = new Cat();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        treadmill.start(robot);
        treadmill.start(human);
        treadmill.start(cat);
        wall.start(robot);
        wall.start(human);
        wall.start(cat);

    }
}
