package homeWorks.hw_2.barriers;

import homeWorks.hw_2.players.Player;

import java.util.Random;

public class Wall extends Barriers {
    private int height;

    private Random r;

    public Wall() {
        r = new Random();
        height = r.nextInt(0, 10);
    }

    public int getHeight() {
        return height;
    }

    public void updateFlag(boolean flag) {
        setFlag(flag); // Передача флага родительскому классу
    }

    public void start(Player player) {
        if (player.getHeight() > height) {
            System.out.println(player + " перепрыгнул стену высотой " + height + " метров.");
        } else {
            System.out.println(player + " не перепрыгнул стену высотой " + height + " метров.");
            updateFlag(true);
        }
    }
}
