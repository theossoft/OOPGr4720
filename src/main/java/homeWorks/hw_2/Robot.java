package homeWorks.hw_2;

public class Robot implements Runnable, Jumpable {
    private int distance = 100;
    private int height = 10;

    public Robot() {
    }

    @Override
    public void jump(int height) {
        if (this.height < height) System.out.println("Робот не смог перепрыгнуть препятствие.");
        else System.out.println("Робот прыгнул на " + height + " метров.");
    }

    @Override
    public void run(int distance) {
        if (this.distance < distance) System.out.println("Робот не смог пробежать дистанцию");
        else System.out.println("Робот пробежал " + distance + " метров.");
    }
}
