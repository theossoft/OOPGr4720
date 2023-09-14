package homeWorks.hw_3.gameType;

import homeWorks.hw_3.AbstractGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> list = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return list;
    }
}
