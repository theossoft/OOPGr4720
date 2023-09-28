package homeWorks.hw_7;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}
