package seminars.seminar_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Рыжий", 21);
        System.out.println("cat1 = " + cat1);
        Animal animal = new Animal();
        animal.animalInfo();
        animal.voice();
        animal.jump();
        cat1.animalInfo();

        Vector vector1 = new Vector(1, 0, 1);
        Vector vector2 = new Vector(2, 1, 3);
        System.out.println("vector.length() = " + vector1.length());
        System.out.println("vector1.scal(vector2) = " + vector1.scal(vector2));
        System.out.println("vector1.vprod(vector2) = " + vector1.vprod(vector2));
        System.out.println("vector1.angle(vector2) = " + vector1.angle(vector2));
        System.out.println("vector1.sum(vector2) = " + vector1.sum(vector2));
    }
}