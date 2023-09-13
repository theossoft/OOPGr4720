package seminars.seminar_3.fruitEnum;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        switch (fruit) {
            case APPLE -> System.out.println("Apple - " + fruit.getName());
        }
    }
}
