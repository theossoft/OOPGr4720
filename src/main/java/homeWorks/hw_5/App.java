package homeWorks.hw_5;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void start() {
        System.out.println("Это телефонная книга. Выбери цифру меню: ");
        System.out.println("0. Создать новую книгу или очистить существующую");
        System.out.println("1. Добавить новый контакт");
        System.out.println("2. Удалить контакт");
        System.out.println("3. Показать все контакты");
        System.out.println("4. Экспортировать контакты в файл");
        System.out.println("5. Импортировать контакты из файла");
        System.out.println("6. Выход");
        int i = scanner.nextInt();
        switch (i){
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> System.out.println();
            case 5 -> System.out.println();
            case 6 -> {
                System.out.println("-----Спасибо, что выбрали наш телефонный справочник. До новых встреч!-----");
                System.exit(0);
            }
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };
    }
}
