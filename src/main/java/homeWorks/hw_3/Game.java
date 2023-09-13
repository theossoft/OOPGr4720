package homeWorks.hw_3;

public interface Game {
    void start(Integer sezeWord, Integer maxTry);

    Answer inputValue(String value);


    GameStatus getGameStatus();
}
