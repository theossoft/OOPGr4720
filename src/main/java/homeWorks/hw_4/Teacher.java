package homeWorks.hw_4;

public class Teacher extends User {
    private int rating;
    private int age;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private String objectToTeach;

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeach='" + objectToTeach + '\'' +
                '}';
    }

    public Teacher(String name, int rating, int age) {
        super(name);
        this.rating = rating;
        this.age = age;
        this.objectToTeach = objectToTeach;
    }

    public Teacher(String name) {
        super(name);
    }
}