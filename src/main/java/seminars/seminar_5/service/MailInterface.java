package seminars.seminar_5.service;

import seminars.seminar_5.data.Mail;

public interface MailInterface {
    String sendMail(Mail mail);
    void returnedMail();
    void getMail();
}
