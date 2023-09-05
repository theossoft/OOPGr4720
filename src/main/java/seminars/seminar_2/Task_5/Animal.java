package seminars.seminar_2.Task_5;

public abstract class Animal {
    public String name;
    public static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal() {
    }

    public abstract void swim(int distance);
    public abstract void run(int distance);
    public void animalInfo() {
        System.out.println("Создано животное.");
    }

    public void voice() {

    }

    public void jump() {

    }
}
