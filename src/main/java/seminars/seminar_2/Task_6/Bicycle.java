package seminars.seminar_2.Task_6;

public class Bicycle implements Transport {
    @Override
    public void run() {
        System.out.println("Велосипед едет");
    }
    @Override
    public void stop() {
        System.out.println("Велосипед стоит");
    }
}
