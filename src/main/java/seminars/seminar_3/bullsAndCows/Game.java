package seminars.seminar_3.bullsAndCows;

public interface Game {
    void start(Integer sezeWord, Integer maxTry);

    Answer inputValue(String value);


    GameStatus getGameStatus();
}
