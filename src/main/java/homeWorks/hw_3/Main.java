package homeWorks.hw_3;

import homeWorks.hw_3.gameType.EnGame;
import homeWorks.hw_3.gameType.NumGame;
import homeWorks.hw_3.gameType.RuGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new NumGame();
        game.start(5, 5);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Меню игры:\n1. Играть в игру \n2. Выйти из игры");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                List<Answer> answers = new ArrayList<>();
                System.out.print("Введите слово: ");
                while (!game.getGameStatus().equals(GameStatus.WIN) && !game.getGameStatus().equals(GameStatus.LOSE)) {
                    String inputWord = scanner.nextLine();
                    Answer answer = game.inputValue(inputWord);
                    answers.add(answer);
                    System.out.println(answer);
                }
                System.out.println(game.getGameStatus());
                System.out.println("Желаете посмотреть логи игры (Y/N): ");
                String inputAnswer = scanner.nextLine();
                if (inputAnswer.equals("Y")) {
                    int index = 1;
                    for (Answer element : answers) {
                        System.out.println(index + " ход. " + element);
                        index++;
                    }
                    System.out.println();
                }
            } else if (input.equals("2")) {
                break;
            } else {
                System.out.println("Введите 1 или 2");
            }
        } while (true);
    }
}
