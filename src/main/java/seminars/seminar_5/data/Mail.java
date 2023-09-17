package seminars.seminar_5.data;

public class Mail {
    private Human to;
    private Postman from;
    private String address;
    private String data;

    public Mail(Human to, Postman from, String address, String data) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }
    public Mail() {

    }

    public Mail generateBaseMail() {
        return new Mail(
                new Human("Vasya", "address"),
                new Postman("Андрюша"),
                "",
                ""
        );
    }
}
