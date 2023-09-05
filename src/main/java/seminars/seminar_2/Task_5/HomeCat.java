package seminars.seminar_2.Task_5;

public class HomeCat extends Cat {
    public static int countHomeCat;

    public HomeCat(String name) {
        super(name);
        countHomeCat++;
    }

    @Override
    public void swim(int distance) {
        if (distance > canSwim) {
            System.out.println(name + " отказывается плавать.");
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
}
