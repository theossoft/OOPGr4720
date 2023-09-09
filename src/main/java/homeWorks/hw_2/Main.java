package homeWorks.hw_2;

public class Main {


    public static void main(String[] args) {
        Robot robot = new Robot();
        Treadmill treadmill = new Treadmill();
        System.out.println(treadmill.getDistance());
        robot.run(treadmill.getDistance());

//        treadmill.start(robot);
    }
}
