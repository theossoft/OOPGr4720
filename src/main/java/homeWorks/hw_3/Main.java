package homeWorks.hw_3;

import homeWorks.hw_3.gameType.NumGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Answer> answers = new ArrayList<>();
        Game game = new NumGame();
        game.start(5,5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        while (!game.getGameStatus().equals(GameStatus.WIN) && !game.getGameStatus().equals(GameStatus.LOSE)){
            String inputWord = scanner.nextLine();
            Answer answer = game.inputValue(inputWord);
            answers.add(answer);
            System.out.println(answer);
        }
        System.out.println(game.getGameStatus());
        System.out.println("Желаете посмотреть логи игры (Y/N): ");
        String inputAnswer = scanner.nextLine();
        if(inputAnswer.equals("Y")) {
            int index = 1;
            for (Answer element : answers) {
                System.out.println(index + " ход. " + element);
                index++;
            }

        }
    }
}
