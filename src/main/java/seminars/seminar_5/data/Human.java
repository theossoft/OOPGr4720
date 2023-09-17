package seminars.seminar_5.data;

public class Human extends User {
    private String address;


    public Human(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
