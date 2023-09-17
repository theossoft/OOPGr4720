package seminars.seminar_5;

import seminars.seminar_5.Controller.Controller;
import seminars.seminar_5.data.Mail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Mail mail = new Mail();
        mail = mail.generateBaseMail();
        controller.start(mail);
    }
}
