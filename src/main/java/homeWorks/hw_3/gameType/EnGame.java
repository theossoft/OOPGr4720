package homeWorks.hw_3.gameType;

import homeWorks.hw_3.AbstractGame;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add(String.valueOf((char)i));
        }
        return list;
    }
}
