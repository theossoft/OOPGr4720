package seminars.seminar_2.Task_6;

public class Skateboard implements Transport {
    @Override
    public void run() {
        System.out.println("Скейт едет");
    }

    @Override
    public void stop() {
        System.out.println("Скейт стоит");
    }
}
