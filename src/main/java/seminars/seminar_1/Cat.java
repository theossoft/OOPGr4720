package seminars.seminar_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Геттеры и сеттеры
@AllArgsConstructor // Конструктор с аргументами
@NoArgsConstructor // Конструктор без аргументов

public class Cat extends Animal {
    String color;
    int age;

    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    @Override
    public void animalInfo() {
        System.out.println(
                "Кот "
                        + super.name
                        + ". Цвет: " + color
                        + ". Возраст: " + age);
    }
}
