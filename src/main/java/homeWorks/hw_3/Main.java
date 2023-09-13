package homeWorks.hw_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new GameNumber();
        game.start(5,5);
        Scanner scanner = new Scanner(System.in);
        while (!game.getGameStatus().equals(GameStatus.WIN) && !game.getGameStatus().equals(GameStatus.LOSE)){
            String inputWord = scanner.nextLine();
            Answer answer = game.inputValue(inputWord);
            System.out.println("answer = " + answer);
        }
        System.out.println(game.getGameStatus());
    }
}
