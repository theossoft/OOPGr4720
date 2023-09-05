package seminars.seminar_2.Task_6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Human human = new Human();
        human.start(car);
        human.start(car);
        human.finish(car);
        Skateboard skateboard = new Skateboard();
        human.start(skateboard);
        human.start(car);
        human.finish(skateboard);
    }
}

