package seminars.seminar_2.Task_5;

public class Dog extends Animal {
    public static final int canRun = 500;
    public static final int canSwim = 10;
    public static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance > canSwim) {
            System.out.println(name + " не смог проплыть " + distance + " метров.");
        } else {
            System.out.println(name + " проплыл " + distance + " метров.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > canRun) {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        } else {
            System.out.println(name + " пробежал " + distance + " метров.");
        }
    }

    @Override
    public void animalInfo() {
        System.out.println(
                "Собака "
                        + super.name + "\n"
                + "Максимальный бег: " + canRun + " метров." + "\n"
                + "Максимальный заплыв: " + canSwim + " метров." + "\n"

        );
    }

    @Override
    public void voice() {

    }

    @Override
    public void jump() {

    }
}
