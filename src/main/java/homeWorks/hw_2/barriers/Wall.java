package homeWorks.hw_2.barriers;

import homeWorks.hw_2.players.Player;

public class Wall extends Barriers {
    private int height = 3;

    public int getHeight() {
        return height;
    }

    public void start(Player player) {
        if (player.getHeight() > height) {
            System.out.println(player + " перепрыгнул стену высотой " + height + " метров.");
        } else {
            System.out.println(player + " не перепрыгнул стену высотой " + height + " метров.");
        }
    }
}
