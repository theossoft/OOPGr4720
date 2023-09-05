package seminars.seminar_2.Task_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Геттеры и сеттеры
@AllArgsConstructor // Конструктор с аргументами
@NoArgsConstructor // Конструктор без аргументов

public abstract class Cat extends Animal {
    public static final int canRun = 200;
    public static final int canSwim = 0;
    public static int countCat;
    String color;
    int age;

    public Cat(String name) {
        super(name);
        countCat++;
    }

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

    @Override
    public void voice() {
        System.out.println("Животное " + name + " издало звук");
    }

    @Override
    public void jump() {
        System.out.println("Животное " + name + " подпрыгнуло!");
    }

    public void curlUpIntoABall() {
        System.out.println(name + " свернулся клубком");
    }
}
