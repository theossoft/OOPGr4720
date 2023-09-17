package seminars.seminar_5.Controller;

import seminars.seminar_5.data.Mail;
import seminars.seminar_5.service.MailService;
import seminars.seminar_5.view.HumanMailView;

import java.util.Scanner;

public class Controller {
    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail mail) {
        String qwe = mailService.sendMail(mail);
        humanMailView.GetMail(qwe);
    }
}
