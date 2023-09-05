package seminars.seminar_2.Task_6;

public class Human {
    private Transport currentTransport;

    public void start(Transport transport) {
        if (currentTransport == null) {
            transport.run();
            currentTransport = transport;
        } else {
            System.out.println("Уже передвигаемся");
        }

    }

    public void finish(Transport transport) {
        if (currentTransport != null) {
            transport.stop();
            currentTransport = null;
        }
    }
}
