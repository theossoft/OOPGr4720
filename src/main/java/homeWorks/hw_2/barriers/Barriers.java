package homeWorks.hw_2.barriers;

import homeWorks.hw_2.players.Player;

public abstract class Barriers {

    public abstract void start(Player player);

    protected boolean flag;

    protected void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }
}
