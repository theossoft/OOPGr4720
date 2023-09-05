package seminars.seminar_2.Task_5;


public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Барсик", "Рыжий", 21);
//        System.out.println("cat1 = " + cat1);
//        cat1.animalInfo();
//        Animal animal = new Cat();
//        ((Cat) animal).curlUpIntoABall();
//        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Cat(), new Dog("Жоржик")));
//        for (Animal animal1 : animals) {
//            animal1.animalInfo();
//        }
//        Dog dog2 = new Dog("Бобик");
//        dog2.animalInfo();

        Animal[] animals = {
                new HomeCat("Буся"),
                new Dog("Жоржик"),
                new Tiger("Тигра"),
                new Dog("Бобик"),
                new HomeCat("Эдик")
        };
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        System.out.println(
                "Количество собак: " + Dog.countDog + "\n" +
                "Количество кошачьих: " + Cat.countCat + ". Из них: " + "\n" +
                "- количество домашних котов: " + HomeCat.countHomeCat + "\n" +
                "- количество тигров: " + Tiger.countTiger
        );
    }
}