package seminars.seminar_2.Task_6;

public class Car implements Transport {
    @Override
    public void run() {
        System.out.println("Машина едет");
    }
    @Override
    public void stop() {
        System.out.println("Машина стоит");
    }
}
