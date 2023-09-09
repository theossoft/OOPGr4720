package homeWorks.hw_2;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        this("Noname");
    }
}
