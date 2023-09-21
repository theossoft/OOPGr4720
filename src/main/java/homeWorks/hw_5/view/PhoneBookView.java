package homeWorks.hw_5.view;

import java.util.List;
import java.util.Map;

public class PhoneBookView {
    public void printPhoneBook(List<String> names, Map<String, String> phoneNumbers) {
        System.out.println("Список контактов:");
        for (String name : names) {
            System.out.println(name + " : " + phoneNumbers.get(name));
        }
    }

    public void printPhone(String name, String phone) {
        System.out.println("Номер телефона контакта " + name + " : " + phone);
    }

    public void printErrorMessage() {
        System.out.println("Контакт не найден");
    }

    public void printSuccessMessage() {
        System.out.println("Контакт успешно добавлен");
    }
}