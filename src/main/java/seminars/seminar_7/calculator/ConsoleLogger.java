package seminars.seminar_7.calculator;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}
