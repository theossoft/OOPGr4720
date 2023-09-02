package seminars.seminar_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Геттеры и сеттеры
@AllArgsConstructor // Конструктор с аргументами
@NoArgsConstructor // Конструктор без аргументов

public class Cat {
    String name;
    String color;
    int age;

//    public Cat(String name, String color, int age) {
//        setName(name);
//        setColor(color);
//        setAge(age);
//    }
//
//    public Cat() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age < 0) throw new IllegalArgumentException();
//        else this.age = age;
//    }
}
