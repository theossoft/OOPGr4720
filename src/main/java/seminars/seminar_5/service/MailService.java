package seminars.seminar_5.service;

import seminars.seminar_5.data.Mail;

public class MailService implements MailInterface {
    @Override
    public String sendMail(Mail mail) {
        return "Письмо " + mail + " было отправлено";
    }

    @Override
    public void returnedMail() {
        System.out.println("Письмо вернули");

    }

    @Override
    public void getMail() {
        System.out.println("Письмо получено");

    }
}
